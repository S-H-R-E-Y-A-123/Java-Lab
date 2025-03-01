Part 1: Shape Definition & Hierarchy
Overview:
The Shape Definition & Hierarchy module establishes the structure for different geometric shapes using inheritance and abstraction. The Shape class serves as an abstract base class, ensuring that all derived shapes implement methods for calculating area and perimeter. Additional shape classes extend this base class to define specific shapes with their own implementations.

Classes and Functions:
Shape (Abstract Class)
Purpose: Acts as a base class for all shapes.
Attributes:
dim_one, dim_two, dim_three (stores shape dimensions).
Methods:
Shape(String shape): A non-abstract constructor that sets the shape name.
abstract double calcArea(): Computes the area of a shape.
abstract double calcPerimeter(): Computes the perimeter of a shape.
abstract double calcVolume(): Computes the volume (for 3D shapes).
Rectangle (Extends Shape)
Constructor: Accepts length and width.
Implements:
calcArea(): Returns length × width.
calcPerimeter(): Returns 2 × (length + width).
Square (Extends Shape)
Constructor: Accepts side length.
Implements:
calcArea(): Returns side².
calcPerimeter(): Returns 4 × side.
Circle (Extends Shape)
Constructor: Accepts radius.
Implements:
calcArea(): Returns π × radius².
calcPerimeter(): Returns 2 × π × radius.
Sphere (Extends Shape)
Constructor: Accepts radius.
Implements:
calcArea(): Returns 4 × π × radius².
calcVolume(): Returns (4/3) × π × radius³.
Cylinder (Extends Shape)
Constructor: Accepts radius and height.
Implements:
calcArea(): Returns 2 × π × radius × (radius + height).
calcVolume(): Returns π × radius² × height.
Equilateral Pyramid (Extends Shape)
Constructor: Accepts side and height.
Implements:
calcArea(): Returns base_area + lateral_surface_area.
calcVolume(): Returns (1/3) × base_area × height.
Part 2: User Input & Calculation Menu
Overview:
The User Input & Calculation Menu module provides an interactive menu-driven program that allows users to select a shape and perform computations such as area, perimeter, and volume calculations.

Classes and Functions:
UserInput (Handles User Input)
Methods:
getDoubleInput(): Reads a valid double input from the user.
getShapeSelection(): Displays available shapes and returns the user’s choice.
Menu (Handles Calculation Options)
Methods:
displayMenu(): Lists available options for calculations.
processChoice(): Directs the program based on the user's selection.
Part 3: Main Execution & Program Flow
Overview:
The Main Execution module integrates shape selection, user input, and calculation functions into a single entry point. It handles user choices and invokes the corresponding shape calculations.

Classes and Functions:
Main (Driver Class)
Responsibilities:
Displays the shape selection menu.
Takes user input for required dimensions.
Computes and displays area, perimeter, and volume based on user selection.
Program Flow:
The program prompts the user to select a shape.
The user enters required dimensions for the selected shape.
The program calculates and displays the corresponding area, perimeter, and volume if applicable.
The program loops back to allow users to perform further calculations until they choose to exit.
 
