
public class Recursive2 {
	
	static int f(int x){
		System.out.print(" "+x);
		if(x==9)return 100;
		return	f(x+1);
	}
	public static void main(String[] args) {
		System.out.println(f(0));
	}
}
