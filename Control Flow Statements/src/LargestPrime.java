
public class LargestPrime {

	public static int getLargestPrime(int number){
		if(number<2)return -1;
		
		int max=0;
		int c=2;
		while(number != 1){
			if(number%c==0){
				max=c;
				number/=c;
				continue;
			}
			c++;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getLargestPrime(91));
	}



}
