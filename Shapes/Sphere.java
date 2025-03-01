// Sphere class inherits from Shape
class Sphere extends Shape {
    // Constructor to initialize the radius
    public Sphere(double radius) {
        super("Sphere");
        this.dim_one = radius;
    }

    // Method to calculate the surface area of a sphere
    @Override
    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }
}
