package finall;

public class SIBTest {
	
	public static final String owner;
	
	static{
		owner = "David";
		System.out.println("SIBTest static initialization block called");
	}
	
	public SIBTest(){
		System.out.println("constructor called");
	}
	
	static{
		System.out.println("2nd initialization block called");
	}
	
	public void someMethod(){
		System.out.println("someMethod called");
	}

}
