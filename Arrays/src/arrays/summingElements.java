package arrays;

public class summingElements {
	public static void main(String args[]){
		
		int arr[]={12,2,57,45,85,6,12,32,45};
		
		int sum=0;
		
		for(int c=0; c< arr.length; c++){
			sum+=arr[c];
		}
		System.out.println("the sum is equal to " + sum);
	}
}
