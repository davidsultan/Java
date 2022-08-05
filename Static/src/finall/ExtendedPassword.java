package finall;

public class ExtendedPassword extends Password{

	private int decryptedPassword;
	
	public ExtendedPassword(int password) {
		// TODO Auto-generated constructor stub
		super(password);
		this.decryptedPassword = password;
	}

//	@Override
//	public void storePassword() {
//		System.out.println("Saving password as : " + this.decryptedPassword);
//	}
	
	

}
