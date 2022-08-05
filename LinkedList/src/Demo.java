import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Alice Springs");
		
		printList(placesToVisit);
		
		visit(placesToVisit);
		
		
//		placesToVisit.add("Sydney");
//		placesToVisit.add("Melbourne");
//		placesToVisit.add("Brisbane");
//		placesToVisit.add("Perth");
//		placesToVisit.add("Adelaide");
//		placesToVisit.add("Darwin");
//		
//		printList(placesToVisit);
//		
//		placesToVisit.add(1,"Alice Springs");
//		printList(placesToVisit);
//		
//		placesToVisit.remove(4);
//		printList(placesToVisit);
		}
	
	private static void printList(LinkedList<String> linkedList){
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext())
			System.out.println("Now visiting " + i.next());
		System.out.println("============================\n");
		
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison == 0){
				System.out.println(newCity + " isalready included as a destination") ;
				return false;
			}else if(comparison > 0){
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if(comparison < 0){
				
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
//	private static void visit(LinkedList cities){
//		Scanner s = new Scanner(System.in);
//		boolean quit = false;
//		ListIterator<String> listIterator = cities.listIterator();
//		if(cities.isEmpty()){
//			System.out.println("No cities in the itenerary");
//			return;
//		}else{
//			System.out.println("Now visiting "+ listIterator.next());
//			printMenu();
//		}
//		while(!quit){
//			int action = s.nextInt();
//			s.nextLine();
//			switch(action){
//			case 0:
//				System.out.println("Holiday (vacation) over hah");
//				quit=true;
//				break;
//			case 1:
//				if(listIterator.hasNext())
//					System.out.println("Now visiting "+ listIterator.next());
//				else
//					System.out.println("Reached the end of the list!");
//				break;
//			case 2:
//				if(listIterator.hasPrevious())
//					System.out.println("Now visiting "+ listIterator.previous());
//				else
//					System.out.println("We are at the start of the list!");
//				break;
//			case 3:
//				printMenu();
//				break;
//			
//			}	
//		}
//	}
	private static void visit(LinkedList cities){
		Scanner s = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		if(cities.isEmpty()){
			System.out.println("No cities in the itenerary");
			return;
		}else{
			System.out.println("Now visiting "+ listIterator.next());
			printMenu();
		}
		while(!quit){
			int action = s.nextInt();
			s.nextLine();
			switch(action){
			case 0:
				System.out.println("Holiday (vacation) over hah");
				quit=true;
				break;
			case 1:
				if(!goingForward){
					if(listIterator.hasNext())
						listIterator.next();
					goingForward = true;
				}
					
				
				if(listIterator.hasNext())
					System.out.println("Now visiting "+ listIterator.next());
				else{
					System.out.println("Reached the end of the list!");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward){
					if(listIterator.hasPrevious())
						listIterator.previous();
					goingForward = false;
				}
				
				
				if(listIterator.hasPrevious())
					System.out.println("Now visiting "+ listIterator.previous());
				else{
					System.out.println("We are at the start of the list!");
					goingForward = true;
				}
				break;
				
			case 3:
				printMenu();
				break;
			
			}	
		}
	}
	
	private static void printMenu(){
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n" + 
						    "1 - to go to next city\n" + 
							"2 - to go to previous city\n" +
						    "3 - to print menu options");
	}

}














