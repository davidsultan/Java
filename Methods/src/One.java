
public class One {
	
	static int f(int x){
		return 3*x*x+7*x;
	}
	static int g(int x,int y){
		return 2*x+5*y;
	}
	public static void main(String[] args) {
		System.out.println(f(g(7,1)));
	}

}
