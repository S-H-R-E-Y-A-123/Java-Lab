//Shreya Chaturvedi, 23070126123, AIML B2

import java.util.Scanner;

// Main class with a menu-driven system to select and compute shape properties
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shape shape = null; // Variable to hold the selected shape object

        while (true) {
            // Display menu options
            System.out.println("\nSelect a Shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Cube");
            System.out.println("5. Sphere");
            System.out.println("6. Cylinder");
            System.out.println("7. Equilateral Pyramid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            // Exit condition
            if (choice == 8) {
                System.out.println("Exiting program...");
                break;
            }

            // Switch-case for different shape options
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                    
                case 2:
                    System.out.print("Enter side: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 4:
                    System.out.print("Enter side length: ");
                    double cubeSide = scan.nextDouble();
                    shape = new Cube(cubeSide);
                    break;

                case 5:
                    System.out.print("Enter radius: ");
                    double sphereRadius = scan.nextDouble();
                    shape = new Sphere(sphereRadius);
                    break;

                case 6:
                    System.out.print("Enter radius: ");
                    double cylRadius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    shape = new Cylinder(cylRadius, height);
                    break;

                case 7:
                    System.out.print("Enter base side: ");
                    double baseSide = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double pyrHeight = scan.nextDouble();
                    shape = new EquilateralPyramid(baseSide, pyrHeight);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            // Display shape properties
            shape.displayShape();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Volume: " + shape.calculateVolume());
        }

        scan.close();
    }
}

