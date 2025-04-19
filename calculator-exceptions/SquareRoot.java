public class SquareRoot {
    public static void sqrt(double x) {
        try {
            if (x < 0) throw new ArithmeticException("Cannot take square root of negative number.");
            System.out.println("Result = " + Math.sqrt(x));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
