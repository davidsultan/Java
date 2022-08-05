import java.util.ArrayList;
import java.util.Scanner;


public class Maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player daud = new Player("elma", 10,233);
		System.out.println(daud.toString());
		saveObject(daud);
		
		daud.setHitPoints(8);
		System.out.println(daud);
		daud.setWeapon("Rocket");
		saveObject(daud);
		loadObject(daud);
		System.out.println(daud);
		
	}
	
	public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

	
	public static void saveObject(ISaveable objectToSave){
		for(int i=0; i<objectToSave.write().size(); i++){
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage");
		}
	}
	
	public static void loadObject(ISaveable objectToSave){
		ArrayList<String> values = readValues();
		objectToSave.read(values);
	}

}
