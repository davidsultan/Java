
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		while(c<15){
			c++;
			
			if(c <= 5){
				System.out.println("Skipping number = "+ c);
				continue;
			}
			System.out.println(c);
			
			if(c >= 10){
				System.out.println("Breaking at "+ c);
				break;
			}
		}
	}

}
