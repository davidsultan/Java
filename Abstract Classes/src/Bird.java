
public abstract class Bird extends Animal implements ICanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is pecking"); 
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Breath in and out horse washing");
	}

	public void fly(){
		System.out.println("Birds can fly generally.");
	}
}
