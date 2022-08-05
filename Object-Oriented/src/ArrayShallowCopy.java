
public class ArrayShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={12,55,8,99};
		System.out.println("previous a[1] = "+a[1]);
		int[] b=a;//they both use the same memory
		b[1]=44;
		System.out.println("current a[1] = "+a[1]);
	}

}
