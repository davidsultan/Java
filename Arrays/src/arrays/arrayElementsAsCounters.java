package arrays;

import java.util.Random;

public class arrayElementsAsCounters {
	public static void main(String[] args) {
		
		Random rand= new Random();
		int arr[]=new int[6];
		
		for(int c=0; c<100000; c++)
			++arr[rand.nextInt(6)];
		System.out.println("Element\tValue");
		
		for(int el=0; el< arr.length; el++)
			System.out.println(el +"\t"+ arr[el]);
	}
}
