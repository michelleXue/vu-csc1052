package week2;

// Represents a shape.
public abstract class Shape {
    private String shapeType;

    // Stores the type of this shape.
    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Returns the type of this shape as a string.
    public String getShapeType() {
        return shapeType;
    }

    // Computes and returns the area of this shape.
    public abstract double computeArea();
}