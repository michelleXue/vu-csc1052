package week2.help;

public class Circle {
	//attribute: radius
	private double radius;
	
	//constructor: initialize the value of attributes
	public Circle (double r) {
		radius = r;
	}
	
	/**
	 * Compute the area of circle
	 * @param none
	 * @return the area of circle
	 */
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
