package arrays;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[]{1,2,3,4,5,6,7,8,9};
		reverse(array);
	}// What is the problem ??
	
	private static void reverse(int[] array){
		
		int[] array1=new int[array.length];

		for(int i=0; i<array.length; i++)
			array1[i]=array[i];
		
		for(int i=0; i<array.length; i++)
			array[i]=array1[array.length-1-i];
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "  ");
			
	}

}





