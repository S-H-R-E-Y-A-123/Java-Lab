# Java Menu-Driven Calculator

This project is a menu-driven Java application that performs a variety of mathematical operations. It demonstrates fundamental programming concepts such as object-oriented programming (OOP), control flow structures, and exception handling to ensure robustness during user interaction.

---

## Features

- **Arithmetic Operations**: Addition, Subtraction, Multiplication, Division
- **Unary Operations**: Square, Cube, Square Root
- **Exception Handling**: Graceful handling of invalid inputs and arithmetic errors
- **Menu-Driven Interface**: User-friendly text-based interaction

---

## Part 1: User Input Handling

### Overview
User input is managed within the `Main` class using Java's `Scanner` class. It allows users to input numbers and choose operations via a numbered menu.

### Classes and Functions

#### `Main`
- Uses `Scanner` for reading user input
- Accepts:
  - Two numbers for binary operations (e.g., addition, division)
  - One number for unary operations (e.g., square root)
- Prompts the user for a choice and processes accordingly

---

## Part 2: Mathematical Operations

### Overview
Each mathematical operation is encapsulated in its own class with static methods. These methods are called directly from the `Main` class.

### Classes and Methods

#### `Addition`
- `add(double a, double b)`: Returns the sum

#### `Subtraction`
- `subtract(double a, double b)`: Returns the difference

#### `Multiplication`
- `multiply(double a, double b)`: Returns the product

#### `Division`
- `divide(double a, double b)`: Returns the quotient
- Handles division by zero exceptions

#### `Square`
- `square(double a)`: Returns the square

#### `Cube`
- `cube(double a)`: Returns the cube

#### `SquareRoot`
- `sqrt(double a)`: Returns the square root
- Handles square root of negative numbers if applicable

---

## Part 3: Main Execution and Menu Control

### Overview
The `Main` class contains the control flow and menu system. It presents a menu and performs operations based on the user's choice.

### Features

- Continuous `while(true)` loop for menu display
- `switch-case` for operation selection
- Option to exit the program
- Wrapped in `try-catch` block to handle all exceptions

---

## Part 4: Exception Handling and Robustness

### Overview
The application is built to handle common runtime exceptions, ensuring a smooth user experience.

### Handled Exceptions

- **InputMismatchException**: Triggered by non-numeric inputs
- **ArithmeticException**: For illegal math operations (e.g., divide by zero)
- **Generic Exception**: Catches any other unexpected errors

---
