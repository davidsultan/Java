
public class RecursiveFibonacci {

	static int fib(int x){
		if(x==1)return 1;
		if(x==2)return 1;
		return fib(x-1)+fib(x-2);
	}
	public static void main(String[] args) {
		for(int c=1;c<11;c++)
			System.out.print(fib(c)+" ");
	}
}
