// Equilateral Pyramid class inherits from Shape
class EquilateralPyramid extends Shape {
    // Constructor to initialize base side length and height
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.dim_one = baseSide;
        this.dim_two = height;
    }
}
