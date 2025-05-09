// Equilateral Pyramid class inherits from Shape
class EquilateralPyramid extends Shape {
    // Constructor to initialize base side length and height
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.dim_one = baseSide;
        this.dim_two = height;
    }

    // Method to calculate the surface area of an equilateral pyramid
    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
        return dim_one * dim_one + 2 * dim_one * slantHeight;
    }

    // Method to calculate the volume of an equilateral pyramid
    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * dim_one * dim_one * dim_two;
    }

    // Method to calculate the perimeter of the square base
    @Override
    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}
