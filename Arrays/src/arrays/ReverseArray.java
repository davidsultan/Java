package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "\t");
		
		System.out.println();
		
		reverse(array);
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "\t");
	}
	
	private static void reverse(int[] array){
		
		int lastindex = array.length -1;
		int halfLength = array.length/2;
		
		for(int i=0; i<halfLength; i++){
			
			int temp = array[i];
			array[i] = array[lastindex-i];
			array[lastindex-i] = temp;
		}
	}

}
