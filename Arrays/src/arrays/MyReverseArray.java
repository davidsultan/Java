package arrays;

import java.util.Arrays;

public class MyReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {1,2,3,4,5};
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ "  ");
		
		System.out.println();
		reverse(array);
		
//		for(int i=0; i<array.length; i++)
//			System.out.print(array[i]+ "  ");
		
		System.out.println(Arrays.toString(array));
	}
	
	private static void reverse(int[] array1){
		
		int[] array2 = new int[array1.length];
		
		for(int i=0; i<array1.length; i++)
			array2[i] = array1[i];
		
		//array1 = {1,2,3,4,5}
		//array2 = {1,2,3,4,5}
		
		for(int i=0; i<array1.length; i++)
			array1[i] = array2[array1.length-1-i];
	}
	
}
