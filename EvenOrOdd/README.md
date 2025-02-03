# Part 1: User Input Handling 

## Overview:
The User Input Handling module provides a flexible method for accepting user input in Java. It allows users to input an array of integers, which will be used for further processing, such as classification into even and odd numbers, finding the smallest consecutive difference, and conversions between arrays and ArrayLists.

## Classes and Functions:
### **userInput**:
- The `userInput` class is responsible for handling user input.
- **`arrayInput()`**: Accepts an array of integers from the user and returns it for further processing.

---

# Part 2: Array Operations 

## Overview:
The Array Operations module contains functions to manipulate arrays, classify numbers, find minimum differences, and perform conversions between arrays and ArrayLists. It provides essential utilities for number classification and transformation.

## Classes and Functions:
### **ArrayFunctions**:
- The `ArrayFunctions` class contains multiple functions for array operations.
- **`display(List<Integer> array)`**: Displays the given list of integers.
- **`evenOdd()`**: Classifies a given set of numbers into even and odd lists and displays them.
- **`ConsecutiveDiff()`**: Identifies two consecutive numbers in the sorted array with the smallest difference and returns their indices.
- **`convertToArrayList(int[] array)`**: Converts an integer array into an `ArrayList<Integer>`.
- **`convertToArray(List<Integer> list)`**: Converts an `ArrayList<Integer>` back into an integer array.

---

# Part 3: Main Execution 

## Overview:
The Main Execution module acts as the entry point for the program. It integrates the `userInput` and `ArrayFunctions` classes to demonstrate various functionalities like classification, difference calculation, and conversions.

## Classes and Functions:
### **Main**:
- The `Main` class drives the execution of the program.
- It initializes an instance of `ArrayFunctions` and `userInput` to:
  - **Classify numbers as even or odd.**
  - **Find the smallest consecutive difference.**
  - **Convert between arrays and ArrayLists.**
