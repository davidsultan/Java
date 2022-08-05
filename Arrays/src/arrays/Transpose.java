package arrays;

public class Transpose {
	
public static void display(int a[][]){
		
		for(int row=0; row<a.length; row++){
			for(int column=0; column<a[row].length; column++)
				System.out.print(a[row][column] + "\t");
		System.out.println();
		}
	}
public static void transpose(int b[][],int c[][]){
	for(int row=0; row<b.length; row++){
		for(int column=0; column<b.length; column++)
			c[row][column]=b[column][row];
	}
	display(c);
}
	public static void main(String[] args) {
		
		int son[][]={{12,18},{77,56}};
		int er[][]= new int[2][2];
		System.out.println("The matrix is !");
		display(son);
		System.out.println("\n");
		transpose(son,er);
		
	}

}
