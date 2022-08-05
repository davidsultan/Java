
public class inchFeetCm {

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double centimeter;
		if((inches >=0) && (inches <=12) && (feet>=0)) {
			centimeter=feet*12*2.54;
			System.out.println(feet + " feet, "+ feet*12 + " inches and "+centimeter+" cm");
			System.out.println(inches + " inc, "+ inches*2.54+ " cm");
			return centimeter;
		}
		System.out.println("invalid range");
		return -1;
	}
	public static double calcFeetAndInchesToCentimeters(double inche) {
		if(inche < 0) {
			System.out.println("not in the valid range");
			return -1;
		}
		double feet=inche/12;
		//
		System.out.println(inche + " inches, "+ feet + " feet");
		
		return calcFeetAndInchesToCentimeters(feet,inche);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcFeetAndInchesToCentimeters(1,0);

	}

}
