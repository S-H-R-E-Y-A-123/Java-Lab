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

    // Method to calculate the volume of a cube
    @Override
    public double calculateVolume() {
        return dim_one * dim_one * dim_one;
    }

    // Perimeter method for a cube (edge sum)
    @Override
    public double calculatePerimeter() {
        return 12 * dim_one;
    }
}
