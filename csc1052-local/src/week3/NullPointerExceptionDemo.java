package week3;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3};
		
		try {				
			System.out.println(array[3]);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException captured");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException captured");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("last element of array: " + array[array.length-1]);
		}

	}

}
