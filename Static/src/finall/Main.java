package finall;

public class Main {

	public static void main(String[] boysAreGonnaBeBoys){
		int pw = 674312;
		
		Password p = new ExtendedPassword(pw);
		p.storePassword();
		p.letMeIn(1);
		p.letMeIn(-1);
		p.letMeIn(3);
		p.letMeIn(54651231);
		p.letMeIn(674312);
		
		System.out.println("\n******************************\n");
		
		SIBTest test = new SIBTest();
		test.someMethod();
		
	}
}
