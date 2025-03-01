// Cylinder class inherits from Shape
class Cylinder extends Shape {
    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.dim_one = radius;
        this.dim_two = height;
    }
}
