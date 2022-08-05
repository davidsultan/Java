
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car david[]=new Car[3];
		
		david[0]=new Mercedes();
		david[1]=new LandRover();
		david[2]=new Lamborghini();
		
		for(int i=0; i<3; ++i)
			david[i].startTheEngine();
	}

}
