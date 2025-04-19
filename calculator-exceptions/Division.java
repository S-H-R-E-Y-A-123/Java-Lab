public class Division {
    public static void divide(double x, double y) {
        try {
            if (y == 0) throw new ArithmeticException("Cannot divide by zero.");
            System.out.println("Result = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
