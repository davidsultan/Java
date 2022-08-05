package scope;

public class ScopeCheck {

	public static int publicVar = 0;
	private int varOne = 1;
	
	public ScopeCheck(){
		System.out.println("ScopeCheck created, publicVar = " + publicVar
				+ ", privateVar = " + varOne);
	}
	public int getPrivateVar(){
		return varOne;
	}
	
	public void timesTwo(){
		int varTwo = 2;
		for(int i=0; i<=9; i++)
			System.out.println(i + " times 2 = " + this.varOne*i);
		//System.out.println(i); After forLoop that "i" can't be used
	}
	
	public void useInner(){
		InnerClass ic = new InnerClass();
		System.out.println("varThree in ÝnnerClass " + ic.varThree);
		System.out.println("FIELD VARÝABLES CAN BE SEEN ÝN BOTH " 
				+ "CONTAINING AND INNER CLASSES");
	}
	
	public class InnerClass{
		
		private int varThree = 3;
		
		public InnerClass(){
			System.out.println("InnerClass created, priavteVar is " + varThree);
		}
		
		public void timesTwo(){
			System.out.println("varOne is still avalable here " + varOne);
			int privateVar = 3;
			for(int i=0; i<=9; i++)
				System.out.println(i + " times 2 = " + privateVar*i);
			//System.out.println(i); After forLoop "i" can't be used
		}
	}


}
