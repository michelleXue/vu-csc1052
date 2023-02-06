package week3;

public class BucketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bucket<String> strBucket = new Bucket<String>();
		
		strBucket.add("one");
		strBucket.add("two");
		strBucket.add("three");
		strBucket.add("four");
		strBucket.add("five");
		
		
		System.out.println(strBucket.toString());
		
		strBucket.removeLast();
		System.out.println(strBucket.toString());
		
		strBucket.remove("six");
		System.out.println(strBucket.toString());
		
		strBucket.remove("two");
		System.out.println(strBucket.toString());
	}

}
