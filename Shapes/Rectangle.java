// Rectangle class inherits from Shape
class Rectangle extends Shape {
    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.dim_one = length;
        this.dim_two = width;
    }

    // Method to calculate the area of a rectangle
    @Override
    public double calculateArea() {
        return dim_one * dim_two;
    }
}
