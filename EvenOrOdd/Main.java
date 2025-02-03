//Shreya Chaturvedi; 23070126123; AIML B2

import java.util.*;

class Main {
    public static void main(String args[]) {
        ArrayFunctions functions = new ArrayFunctions();
        userInput inputHandler = new userInput();

        // Classify even and odd numbers
        functions.evenOdd();

        // Find neighboring numbers with the smallest difference
        functions.ConsecutiveDiff();

        // Convert array to ArrayList and vice versa
        int[] sampleArray = inputHandler.arrayInput();
        
        // Convert to ArrayList and display
        List<Integer> arrayList = functions.convertToArrayList(sampleArray);
        System.out.println("Converted ArrayList: " + arrayList);

        // Convert back to array and display
        int[] newArray = functions.convertToArray(arrayList);
        System.out.println("Converted back to array: " + Arrays.toString(newArray));
    }
}
