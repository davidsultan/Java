import java.util.Scanner;

public class ReadingUserInputChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);

		int c=1;
		int sum=0;
		while(c<=10){
			System.out.println("Enter number "+ c);
			boolean hasnextint = user.hasNextInt();
			if(hasnextint){
				int input=user.nextInt();
				sum+=input;
				c++;
			}else
				System.out.println("Invalid value");
			user.nextLine();//This prevents endless loop
		}
		System.out.println("The sum is equal to "+ sum);
		
		user.close();
	}

}
