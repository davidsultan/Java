
public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		while(count<6){
			count++;
			System.out.println(count);
		}
		System.out.println();
		do{
			System.out.println(count);
			count--;
		}while(count!=0);
	}

}
