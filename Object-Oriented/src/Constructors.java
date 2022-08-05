
class person{
	int height;
	int weight;
	int age;
	
	public person(){//constructors have same name with class and has no return
		System.out.println("An person object was created !");
		age=1;
	}//polymorphism : to use multiple constructors
	public person(int height,int weight,int age){
		this();
		this.height=height;
		this.weight=weight;
		this.age=age;
	}
}
public class Constructors{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person cengo=new person(175,85,56);
		person hamit=new person();//default constructor
		new person();
		System.gc();
		hamit.height=190;
		hamit.weight=80;
		System.out.println("Hamit :"+hamit.height+" "+hamit.weight);
		System.out.println("Cengo :"+cengo.height+" "+cengo.weight);
	}

}
