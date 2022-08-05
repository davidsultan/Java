
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bx = 13; //1101b
		System.out.println("bitwise AND :"+ (bx & 7));//1101 ? 0111
		System.out.println("exclusive OR :"+(bx ^ 7));//1101 ? 0111
		System.out.println("inclusive OR :"+(bx | 7));//1101 ? 0111
	}

}
