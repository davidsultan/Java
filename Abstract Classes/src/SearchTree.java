
public class SearchTree implements INodeList{

	private ListItem root = null;
	
	public SearchTree(ListItem root){
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		// TODO Auto-generated method stub
		if(this.root == null){
			//The list was empty so this item becomes the head of the list
			this.root = newItem;
			return true;
		}
		
		// otherwise start comparing from th head of the tree
		ListItem currentItem = this.root;
		while(currentItem != null){
			int comparison = (currentItem.compareTo(newItem));
			if(comparison <0){
				//newItem is greater, move right if possible
				if(currentItem.next() != null)
					currentItem = currentItem.next();
				else{
					//there's no node to the right, so add at this point
					currentItem.setNext(newItem);
					return true;
				}
			}else if(comparison >0){
				//new itm is less, move left if possble
				if(currentItem.previous() != null){
					currentItem = currentItem.previous();
				}else{
					//the node with a previous is the root
					currentItem.setPrevious(newItem);
					return true;
				}
				return true;
			}else{
				//equal, so don't add
				System.out.println(newItem.getValue() + " is already present, not added.");
				return false;
			}
		}
		// We can't actually get here, but Java complains if there's no return
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		if(item != null)
			System.out.println("Deleting item " + item.getValue());
		
		ListItem currentItem = this.root;
		ListItem parentItem = currentItem;
		
		while(currentItem != null){
			int comparison = currentItem.compareTo(item);
			if(comparison < 0){
				parentItem = currentItem;
				currentItem = currentItem.next();
			}else if(comparison > 0){
				parentItem = currentItem;
				currentItem = currentItem.previous();
			}
			else{
				// equal: we have found teh item so remove it
				performRemoval(currentItem, parentItem);
				return true;
			}
		}
		// We ahve reached the end of list without finding item to delete
		return false;
	}
	
	private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }


	@Override
	public void traverse(ListItem root) {
		// recursive method
		if(root != null){
			traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());
		}
	}
}
