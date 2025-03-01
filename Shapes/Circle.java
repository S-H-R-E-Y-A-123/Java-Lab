// Circle class inherits from Shape
class Circle extends Shape {
    // Constructor to initialize the radius
    public Circle(double radius) {
        super("Circle");
        this.dim_one = radius;
    }

    // Method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * dim_one * dim_one;
    }
}
