package scope;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String varFour = "privateVar in main( )";
		
		ScopeCheck sc = new ScopeCheck();
		System.out.println(sc.getPrivateVar());
		System.out.println(ScopeCheck.publicVar);
		
		sc.timesTwo();
		
		System.out.println("\n************************\n");
		
		ScopeCheck.InnerClass ico = sc.new InnerClass();
		ico.timesTwo();
		
		sc.useInner();
		
//		ScopeCheck.InnerClass innerObject = sc.new InnerClass();
//		System.out.println("varThree is not accessible here " + innerObject.varThree);
		
	}

}
