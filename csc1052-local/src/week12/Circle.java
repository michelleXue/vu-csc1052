package week12;

public class Circle {
	//attribute: radius
	private int radius;
	
	//constructor: initialize the value of attributes
	public Circle (int r) {
		radius = r;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "radius: " + radius;
	}
}
