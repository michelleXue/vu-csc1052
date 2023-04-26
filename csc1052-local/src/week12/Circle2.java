package week12;

public class Circle2 {
	//attribute: radius
	private int radius;
	
	//constructor: initialize the value of attributes
	public Circle2 (int r) {
		radius = r;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "radius: " + radius;
	}

	// Compares the equality of two products
	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle2)) {
            return false;
        }
        
        Circle2 other = (Circle2) obj;
        return this.radius == other.radius;
    }
	
}
