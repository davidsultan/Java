
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker Mesut = new Worker();
		Mesut.height=190;
		Mesut.weight=70;
		Mesut.age=33;
		System.out.println("here is the Mesut "+"age :" +Mesut.age+" height :"+Mesut.height+" weight :"+Mesut.weight);
		Human Bekir = new Human();
		Bekir.height=195;
		Bekir.weight=75;
		Bekir.age=35;
		System.out.println("here is the Bekir "+"age :" +Bekir.age+" height :"+Bekir.height+" weight :"+Bekir.weight);
		Mesut.food();
		Bekir.food();
		System.out.println("here is the Mesut "+"age :" +Mesut.age+" height :"+Mesut.height+" weight :"+Mesut.weight);
		System.out.println("here is the Bekir "+"age :" +Bekir.age+" height :"+Bekir.height+" weight :"+Bekir.weight);
		Mesut.salary=1600;
		System.out.println("Salary :"+Mesut.salary);
		Mesut.raise(30);
		System.out.println("The new salary :"+Mesut.salary);
	}

}
