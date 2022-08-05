import java.util.Scanner;


public class Maiin {
	
	private static Scanner s = new Scanner(System.in);
	private static MobilePhone mp = new MobilePhone("05416312342");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quit=false;
		startPhone();
		printActions();
		
		while(!quit){
			System.out.println("\nEnter action: (press 6 to show available actions!");
			int action = s.nextInt();
			s.nextLine();
			
			switch(action){
			
			case 0:
				System.out.println("\nShutting down...");
				quit = true;
				break;
			case 1:
				mp.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
		}
	}
	
	private static void addNewContact(){
		System.out.println("Enter new contact name: ");
		String name = s.nextLine();
		System.out.println("Enter phone number: ");
		String phone = s.nextLine();
		Contact newContact = Contact.createAContact(name, phone);
		// we could use the class name directly, not object
		// createAContact method is static
		if(mp.addNewContact(newContact))
			System.out.println("New contact added: naemme = "+name+ "phone = "+phone);
		else
			System.out.println("Cannot add, "+name+" already on file!");
	}
	private static void removeContact(){
		System.out.println("Enter existing contact name!");
		String name = s.nextLine();
		Contact existingContactRecord = mp.queryContact(name);
		if(existingContactRecord == null){
			System.out.println("Contact not found");
			return;
		}
		if(mp.removeContact(existingContactRecord))
			System.out.println("Successfully deleted");
		else
			System.out.println("Error deleting contact");
	}
	
	private static void queryContact(){
		System.out.println("Enter existing contact name!");
		String name = s.nextLine();
		Contact existingContactRecord = mp.queryContact(name);
		if(existingContactRecord == null){
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name: " + existingContactRecord.getName() +
						" phone number is " + existingContactRecord.getPhoneNumber());
		
	}
	
	private static void updateContact(){
		System.out.println("Enter existing contact name!");
		String name = s.nextLine();
		Contact existingContactRecord = mp.queryContact(name);
		if(existingContactRecord == null){
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Enter new contact name: ");
		String newName = s.nextLine();
		System.out.println("Enter new contact phone number: ");
		String newNumber = s.nextLine();
		Contact newContact = Contact.createAContact(newName, newNumber);
		if(mp.updateContact(existingContactRecord, newContact))
			System.out.println("Successfully updated");
		else
			System.out.println("Error updating record");
	}
	
	private static void startPhone(){
		System.out.println("Starting galaxy s9...");
	}
	
	private static void printActions(){
		System.out.println("\nAvailable actions:\npress\n" +
						   "0 - to shutdown\n" +
						   "1 - to print contacts\n" +
						   "2 - to add a new contact\n" +
						   "3 - to update an existing contact\n" +
						   "4 - to remove an existing contact\n" +
						   "5 - query if an existing contact exists\n" +
						   "6 - to print a list of availanle actions.");
		System.out.println("Choose your action: ");
	}

}
