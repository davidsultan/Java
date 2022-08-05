
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DeskPhone davidsPhone = new DeskPhone(4562311);
		ITelephone davidsPhone = new DeskPhone(4562311);
		//davidsPhone = new DeskPhone(1345633);
		davidsPhone.powerOn();
		davidsPhone.callPhone(456413);
		davidsPhone.answer();
		
		davidsPhone = new MobilePhone(54122322);
		davidsPhone.powerOn();
		davidsPhone.callPhone(54122322);
		davidsPhone.answer();
	}

}
