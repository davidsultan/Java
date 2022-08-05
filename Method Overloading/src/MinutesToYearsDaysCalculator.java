
public class MinutesToYearsDaysCalculator {

	public static void printYearsAndDays(long minutes) {
		if(minutes<0)
			System.out.println("Invalid Value");
		else{
			long remaining = minutes%525600;
			System.out.println(minutes+" min = "+minutes/525600+ " y and "
			+ remaining/1440+" d");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(525600);

	}

}
