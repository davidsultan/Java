import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub

		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your year of birth !");
		int year = user.nextInt();
		user.nextLine();//handle next line character (enter key)
		//Without this, we get error
		int age= 2019-year;
		System.out.println("Enter your name mate ");
		String name = user.nextLine();
		
		System.out.println("Your name is "+ name + " and your age is "+ age);
		
		user.close();*/
		
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your year of birth !");
		boolean hasNextInt = user.hasNextInt();
		if(hasNextInt){
			int year = user.nextInt();
			user.nextLine();//handle next line character (enter key)
			//Without this, we get error
		
			System.out.println("Enter your name mate ");
			String name = user.nextLine();
		
			int age= 2019-year;
			if(age >=0 && age<=200)
				System.out.println("Your name is "+ name +" and your age is "+age);
			else
				System.out.println("Invalid year of birth");
		}else
			System.out.println("no way to parse this thing");
			
		user.close();
	}

}
