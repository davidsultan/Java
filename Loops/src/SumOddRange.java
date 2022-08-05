
public class SumOddRange {
	public static boolean isOdd(int number){
			return number>=0 && number%2 != 0;
	}
	public static int sumOdd(int start, int end){
		if(end<start || end<0 || start<0)
			return -1;
		int sum=0;
		for(int c =start;c<=end;c++){
			if(isOdd(c)==true)
				sum+=c;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOdd(100,1000));

	}

}
