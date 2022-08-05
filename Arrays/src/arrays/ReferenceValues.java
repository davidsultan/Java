package arrays;

import java.util.Arrays;

public class ReferenceValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray= new int[5];
		System.out.println(Arrays.toString(myArray));
		
		int[] anotherArray= myArray;
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray = new int[]{4,5,6,7,8};
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(anotherArray));
		
		modify(myArray);
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(anotherArray));
		
	}
	public static void modify(int[] array){
		
		array[1]=5; 
		
		array= new int[]{1,3,3};
		
		System.out.println("array in static modify method\r" + Arrays.toString(array));
		
	}

}
