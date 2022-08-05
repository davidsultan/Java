package staticc;

public class Main {

	public static int multiplier = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest firstInstance = new StaticTest("1st Instance");
		System.out.println(firstInstance.getName()+" is instance number " + StaticTest.getNumInstances());
		
		StaticTest secondInstance = new StaticTest("2st Instance");
		System.out.println(secondInstance.getName()+" is instance number " + secondInstance.getNumInstances());
		
		System.out.println("\n The result is " + multiply(8));
		System.out.println("\n The multiplier is " + multiplier);
	}
	
	public static int multiply(int num){
		return num*multiplier;
	}

}
