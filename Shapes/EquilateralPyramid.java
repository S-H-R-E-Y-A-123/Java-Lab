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
}
