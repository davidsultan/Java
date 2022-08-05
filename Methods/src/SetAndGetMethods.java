
public class SetAndGetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetAndGetMethods2 sagm2object= new SetAndGetMethods2();
		SetAndGetMethods2 sagm2object2= new SetAndGetMethods2(5);
		SetAndGetMethods2 sagm2object3= new SetAndGetMethods2(5,27);
		SetAndGetMethods2 sagm2object4= new SetAndGetMethods2(5,30,00);
		
		System.out.printf("%s\n",sagm2object.toMilitary());
		System.out.printf("%s\n",sagm2object2.toMilitary());
		System.out.printf("%s\n",sagm2object3.toMilitary());
		System.out.printf("%s\n",sagm2object4.toMilitary());
	}

}
