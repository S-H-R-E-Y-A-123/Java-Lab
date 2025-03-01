// Square class inherits from Shape
class Square extends Shape {
    // Constructor to initialize the side length
    public Square(double side) {
        super("Square");
        this.dim_one = side;
    }

    // Method to calculate the area of a square
    @Override
    public double calculateArea() {
        return dim_one * dim_one;
    }

    // Method to calculate the perimeter of a square
    @Override
    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}
