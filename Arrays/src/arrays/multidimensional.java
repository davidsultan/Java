package arrays;
public class multidimensional {
	
	public static void display(int a[][]){
		
		for(int row=0; row<a.length; row++){
			for(int column=0; column<a[row].length; column++)
				System.out.print(a[row][column] + "\t");
		System.out.println();
		}
	}
	
	public static void main(String args[]){
		int er[][]= {{456,55,65},{321,54,6446}};
		int son[][]={{12,23,2},{639,654},{2,6,56}};
		System.out.println("the first array");
		display(er);
		System.out.println("This is the second array !");
		display(son);
	}
}
