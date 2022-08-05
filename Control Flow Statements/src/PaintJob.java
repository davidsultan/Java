
public class PaintJob {

	public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
		if(extraBuckets<0 || width<=0 || height<=0 || areaPerBucket<=0)
			return -1;
		
		double area= width*height;
		double available= areaPerBucket*extraBuckets;
		return (int) Math.ceil((area-available)/areaPerBucket);
	}
	public static int getBucketCount(double width,double height,double areaPerBucket){
		if(width<=0 || height<=0 || areaPerBucket<=0)
			return -1;
		
		double area= width*height;
		return (int) Math.ceil(area/areaPerBucket);
	}
	public static int getBucketCount(double area,double areaPerBucket){
		if(area<=0 || areaPerBucket<=0)
			return -1;
		
		return (int) Math.ceil(area/areaPerBucket);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getBucketCount(3.4,2.1,1.5));
	}
}
