
public class MobilePhone implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Mobile phne powered up haaa");
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		if(isOn){
			System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
		}else
			System.out.println("Phone is switched off");
		
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
		if(isRinging){
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		
		if(phoneNumber == myNumber && isOn){
			isRinging = true;
			System.out.println("melody playing ...");
		}else{
			isRinging = false;
			System.out.println("Mobile phone not on or you got fake numbered Lol");
		}
			
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		
		return isRinging;
	}
}