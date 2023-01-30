package week3;

import java.util.Random;

public class DivideByZeroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();		
		int rand = gen.nextInt(2);
		
		try {
			double result = 45 / rand;
		} catch (ArithmeticException a) {
			System.out.println("Hey, don't divide by zero!");
		} finally {
			System.out.println("Calculation finished");
		}

	}

}
