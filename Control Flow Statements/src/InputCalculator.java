import java.util.Scanner;

public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage(){
		Scanner user=new Scanner(System.in);
		
		int sum=0;
		int c=0;
		int number=0;
		while(true){
			boolean isanint=user.hasNextInt();
			if(isanint){
				number = user.nextInt();
				sum=sum+number;
				c++;
			}else
				break;
			user.nextLine();
		}
		if(sum==0)c=1;
		System.out.println("SUM = "+ sum + " AVG = "+ sum/c);
		user.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputThenPrintSumAndAverage();
	}

}
