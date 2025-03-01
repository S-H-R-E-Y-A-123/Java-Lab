// Abstract class Shape, serves as the base class for all shapes.
abstract class Shape {
    protected double dim_one, dim_two, dim_three;  
    protected String shapeType;

    // Constructor to initialize the shape type
    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }
}
