
public class Penguin extends Bird{

	public Penguin(String name){
		super(name);
	}
	
	public void fly(){
		super.fly();
		System.out.println("I'am not very good at that. Can i go for a swim instead?!");
	}
}
