package week2;

// Represents a circle shape with a particular radius.
public class Circle extends Shape {
    private double radius;

    // Stores the radius of this circle.
    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    // Computes and returns the area of this circle.
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}