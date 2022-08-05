import java.util.Scanner;


public class MinAndMaxChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user = new Scanner(System.in);
		
/*		int max=-100;
		int min=2000;
		System.out.println("Enter number to compute max and min");
		while(true){
			boolean isanint = user.hasNextInt();
			if(isanint){
				int number=user.nextInt();
				if(number>max)
					max=number;
				if(number<min)
					min=number;
			}else
				break;
			user.nextLine();
		}
		System.out.println(max+" min "+ min);
		
		user.close();
		
		int max=-2147483648;
		int min=2147483647;
		System.out.println("Enter number to compute max and min");
		while(true){
			boolean isanint = user.hasNextInt();
			if(isanint){
				int number=user.nextInt();
				if(number>max)
					max=number;
				if(number<min)
					min=number;
			}else
				break;
			user.nextLine();
		}
		System.out.println("max = " + max +" and min ="+ min);
		
		user.close();
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("Enter number to compute max and min");
		while(true){
			boolean isanint = user.hasNextInt();
			if(isanint){
				int number=user.nextInt();
				if(number>max)
					max=number;
				if(number<min)
					min=number;
			}else
				break;
			user.nextLine();
		}
		System.out.println("max = " + max +" and min ="+ min);
		
		user.close();*/
		
		boolean flag = true;
		int min =0;
		int max =0;
		
		System.out.println("Enter number to compute max and min");
		while(true){
			boolean isanint = user.hasNextInt();
			if(isanint){
				int number=user.nextInt();
				
				if(flag){
					flag = false;
					min=number;
					max=number;
				}
				if(number>max)
					max=number;
				if(number<min)
					min=number;
			}else
				break;
			user.nextLine();
		}
		System.out.println("max = " + max +" and min ="+ min);
		
		user.close();
	}

}
