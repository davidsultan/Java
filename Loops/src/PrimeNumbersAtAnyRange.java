
public class PrimeNumbersAtAnyRange {
	
	public static boolean isPrime(int x){
		
		if(x<=1)return false;
			
		for(int c=2; c<=Math.sqrt(x); c++)
			if(x%c==0)
				return false;
		return true;
	}

	public static void main(String[] args){
		int count=0;
		for(int c=40; c<50; c++){
			if(count==5)break;
			if(isPrime(c)==true){
				System.out.println(c);
				count++;
			}
		}
	}
}
