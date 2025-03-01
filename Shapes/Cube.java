// Cube class inherits from Shape
class Cube extends Shape {
    // Constructor to initialize the side length
    public Cube(double side) {
        super("Cube");
        this.dim_one = side;
    }

    // Method to calculate the surface area of a cube
    @Override
    public double calculateArea() {
        return 6 * dim_one * dim_one;
    }
}
