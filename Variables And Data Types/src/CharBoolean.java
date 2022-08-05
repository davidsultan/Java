
public class CharBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 bytes, 16 bit
		char micro = '\u00b5';//unicode table
		System.out.println(micro);
		
		boolean boo1=false;
		
		if(boo1)
			System.out.println("because boo1 is false");
		if(boo1 = true)
			System.out.println("if we use assignment operator and true in parenthesses together, if statement always works.");
		if(boo1 =! false)
			System.out.println("not equal");
		if(boo1)
			System.out.println("because boo1 became true in first if");
	}

}
