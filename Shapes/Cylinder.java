// Cylinder class inherits from Shape
class Cylinder extends Shape {
    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.dim_one = radius;
        this.dim_two = height;
    }

    // Method to calculate the surface area of a cylinder
    @Override
    public double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }
}
