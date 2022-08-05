import java.util.ArrayList;


public class AutoboxingUnboxing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[2];
		int[] intArray = new int[65];
		
		ArrayList<String> arrayList = new ArrayList<String>();
		//ArrayList<int> arrayList = new ArrayList<int>();
		
		ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
		intArrayList.add(new IntClass(54));
		
		Integer intobj = new Integer(5);
		Double doubleobj = new Double(5.5);
		
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
			integerArrayList.add(Integer.valueOf(i));
							   //Integer.valueOf(i) --> auto boxing
		
		for(int i=0; i<10; i++)
			System.out.println(i + " --> " + integerArrayList.get(i).intValue());
										//integerArrayList.get(i).intValue()--> unboxing
		
		
		Integer myNewInt = Integer.valueOf(56);
		//Integer myInt = 56;// this means --> Integer myInt = Integer.valueOf(56);
		
		int myInt = myNewInt;// this means --> int myInt = myNewInt.intValue();
		
		
		
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		
		for(double db1=0.0; db1<10.0; db1 += 0.5)
			myDoubleValues.add(Double.valueOf(db1));
		
		for(int i=0; i<myDoubleValues.size(); i++){
			double value = myDoubleValues.get(i).doubleValue();
			System.out.println(i + " --> " + value);
		}
			
	}		

}

class IntClass{
	private int myValue;
	
	public IntClass(int myValue){
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}