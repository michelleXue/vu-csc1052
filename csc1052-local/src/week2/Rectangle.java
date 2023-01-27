package week2;

// Represents a rectangle shape with a particular length and width.
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Stores the length and width of this rectangle.
    public Rectangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    // Computes and returns the area of this rectangle.
    public double computeArea() {
        return length * width;
    }
}