
public class areaCircleRectangular {

	public static double AreaCalculator(double radius) {
		if(radius<0)
			return -1;
		//return 3.1415*radius*radius;
		return Math.PI*radius*radius;
	}
	public static double AreaCalculator(double x,double y) {
		if(x<0 || y<0)
			return -1;
		return x*y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AreaCalculator(5.0));

	}

}
