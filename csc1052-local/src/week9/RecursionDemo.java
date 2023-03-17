package week9;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long results = factorial(5);
		System.out.println(results);
		
		long result2 = powerRecur(2,3); // n >= 1
		System.out.println(result2); // you should see 8.
		
		int[] arr = {4, 6, 7, 15, 20, 22, 25, 27};
		int target = 20;
		System.out.println(binarySearch(20, arr));
		
	}
	
	public static boolean binarySearch(int target, int[] array) {
		return binarySearch(target, 0, array.length-1, array);
	}
	
	public static boolean binarySearch(int target, int first, int last, int[] array) {
		// update midpoint index
		int midpoint = (first + last) / 2;
		
		if (last < first) { // base case cond 1: eliminate all elements
			
			return false;
		
		} else if (target == array[midpoint]) { // base case cond 2: find the target
			
			return true;
			
		} else if (array[midpoint] > target) { // recursive cond 1. remove second half
			
			return binarySearch (target, first, midpoint - 1, array);
			
		} else { // recursive cond 2.
			
			return binarySearch (target, midpoint + 1, last, array);
			
		}
		
	}
	
	public static long factorial (int n) {
		
		// general case for smaller and smaller problem
		if (n > 1) {
			return n * factorial(n-1);
		}
		else if (n == 1) {
			return 1;
		}
		else {  // 
			return 0;
		}
	}
	
	public static long powerRecur(int m, int n) {
		if (n > 1) {
			return m * powerRecur(m, n-1);
		} else if (n == 1) {
			return m;
		} else {
			return 0;
		}
	}

}
