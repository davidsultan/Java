
public class RecursiveBinary {
		static int f(int x){
			
			System.out.print(x%2);
			if (x/2==0)return 1;
			return f(x/2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f(14);
	}

}