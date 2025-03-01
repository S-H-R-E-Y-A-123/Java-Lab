// Abstract class Shape, serves as the base class for all shapes.
abstract class Shape {
    protected double dim_one, dim_two, dim_three;  
    protected String shapeType;

    // Constructor to initialize the shape type
    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Method to display the shape type
    public void displayShape() {
        System.out.println("\nSelected Shape: " + shapeType);
    }

    // Abstract methods for area and perimeter calculations
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    // Volume method with default return for 2D shapes
    public double calculateVolume() {
        return 0;
    }
}
