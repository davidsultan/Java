
public abstract class Animal {
	
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	abstract void eat();
	public abstract void breath();
	
	public String getName(){
		return name;
	}

}
