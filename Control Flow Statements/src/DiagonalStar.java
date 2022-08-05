
public class DiagonalStar {
	public static void printSquareStar(int number){
		if(number<5)
			System.out.println("Invalid Value");
		else
			for(int r=1; r<=number; r++){
				for(int c=1; c<=number; c++){
					if(r==1 || c==1 || r==c || r==number || c==number || (r+c)-1==number)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSquareStar(18);
	}



}
