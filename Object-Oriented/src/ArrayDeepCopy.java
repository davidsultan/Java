
public class ArrayDeepCopy {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={12,4,55,6,87,6,56,82,321,32};
		int[] b=new int[a.length];
		
		System.arraycopy(a,0,b,0,a.length);
		
		for(int c=0; c<b.length;c++)//we copied from a to b;
			System.out.print(b[c]+" ");
	}

}
