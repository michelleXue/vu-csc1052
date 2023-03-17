package week9;

public class RecursiveGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(16,24));
		System.out.println(gcd(100,500));
	}
	
	public static int gcd(int m, int n) {
		if (m % n == 0)  // base case
	        return n;
	    else
	        return gcd(n, m % n);  // recursive call
	}

}
