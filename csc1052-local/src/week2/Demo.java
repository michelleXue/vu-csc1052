package week2;

import java.util.Scanner;

import week2.help.*;

public class Demo {

	public static void main(String[] args) {
		
		// create a Circle object
		Circle c = new Circle(2.5);
		
		System.out.println(c.computeArea());

		Scanner scan = new Scanner(System.in);
		
		ArrayProcessing ap = new ArrayProcessing();
		
		// polymorphism
		Shape shape = new Circle(4.7);
		System.out.println(shape.computeArea());
		
		shape = new Rectangle(3, 8);
		System.out.println(shape.computeArea());
		
		
		int cutoff = 10;
		Object obj;
		if (cutoff <= 50)
			obj = new String("Hello");
		else
			obj = new Circle(4.7);
		
		System.out.print(obj.toString());
		
	}

}
