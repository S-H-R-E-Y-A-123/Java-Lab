import java.util.*;

class ArrayFunctions {

    // Function to display an array
    void display(List<Integer> array) {
        System.out.println("Array: " + array);
    }

    // Function to classify even and odd numbers into separate arrays
    void evenOdd() {
        userInput inputHandler = new userInput();
        int[] numbers = inputHandler.arrayInput();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
