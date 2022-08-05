
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Dog dog = new Dog("Çomar");
//		dog.eat();
//		dog.breath();
//		
//		Parrot parrot = new Parrot("Kemal");
//		parrot.breath();
//		parrot.eat();
//		parrot.fly();
//		
//		Penguin penguin = new Penguin("Kemal");
//		penguin.fly();
		
		
		
		SearchTree tree = new SearchTree(null);
		tree.traverse(tree.getRoot());
		
		String stringData = "5 7 3 9 8 2 1 0 4 6";
		String[] data = stringData.split(" ");
		for(String s : data){
			//create new item with value set to the string s
			tree.addItem(new Node(s));
		}
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("3"));
		tree.traverse(tree.getRoot());
	}

}


