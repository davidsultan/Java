package arrays;

import java.util.Scanner;

public class MinElement {

	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of elements");
		int count = scanner.nextInt();
		//scanner.nextLine();
		
		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		
		System.out.println("Min = " + returnedMin);
	}
	
	private static int findMin(int[] array){
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++){
			//int value = array[i];
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
	private static int[] readIntegers(int count){
		
		int[] array = new int[count];
		System.out.println("Enter " + count +  " numbers ");
		
		for(int i=0; i<array.length; i++){
			int number=scanner.nextInt();
			scanner.nextLine();
			array[i]=number;
		}
		return array;
	}

}
