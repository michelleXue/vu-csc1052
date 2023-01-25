package week1;

public class Circle {
	//attribute: radius
	private double radius;
	
	//constructor: initialize the value of attributes
	public Circle (double r) {
		radius = r;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
