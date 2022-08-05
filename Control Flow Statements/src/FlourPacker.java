
public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal){
		if(bigCount <0 || smallCount <0 || goal <0)
			return false;
		int bc = 5*bigCount;
		int sc = smallCount;
		
		if(bc>=goal)
			return goal%5<=smallCount;
		return bc+sc>=goal && bigCount<=goal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canPack(4,18,19));
	}
	


}
