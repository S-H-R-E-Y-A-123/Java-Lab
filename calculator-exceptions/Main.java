// Shreya Chaturvedi, 23070126123, AIML B2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;

        while (true) {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Addition.add(a, b);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Subtraction.subtract(a, b);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Multiplication.multiply(a, b);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        Division.divide(a, b);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        Square.square(a);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        Cube.cube(a);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        SquareRoot.sqrt(a);
                        break;
                    case 8:
                        System.out.println("Exiting... Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
