# Part 1: Shape Representation  

## Overview:  
The Shape Representation module defines the structure of different geometric shapes. Each shape has properties such as area, perimeter, and volume, depending on its dimensions.  

## Classes and Functions:  

### Shape:  
- The `Shape` class represents a **generic shape**.  
- It contains attributes for:  
  - **Dimensions** (e.g., length, width, height, radius).  
- Provides methods to:  
  - Compute **area** of the shape.  
  - Compute **perimeter** of the shape.  
  - Compute **volume**, if applicable.  

### Rectangle:  
- The `Rectangle` class represents a **rectangular shape**.  
- It contains attributes for:  
  - **Length** and **Width**.  
- Provides methods to:  
  - Calculate **area** as `length × width`.  
  - Calculate **perimeter** as `2 × (length + width)`.  

### Square:  
- The `Square` class represents a **square shape**.  
- It contains attributes for:  
  - **Side length**.  
- Provides methods to:  
  - Calculate **area** as `side²`.  
  - Calculate **perimeter** as `4 × side`.  

### Circle:  
- The `Circle` class represents a **circular shape**.  
- It contains attributes for:  
  - **Radius**.  
- Provides methods to:  
  - Calculate **area** as `π × radius²`.  
  - Calculate **perimeter** as `2 × π × radius`.  

### Sphere:  
- The `Sphere` class represents a **three-dimensional sphere**.  
- It contains attributes for:  
  - **Radius**.  
- Provides methods to:  
  - Calculate **surface area** as `4 × π × radius²`.  
  - Calculate **volume** as `(4/3) × π × radius³`.  

### Cylinder:  
- The `Cylinder` class represents a **cylindrical shape**.  
- It contains attributes for:  
  - **Radius** and **Height**.  
- Provides methods to:  
  - Calculate **surface area** as `2 × π × radius × (radius + height)`.  
  - Calculate **volume** as `π × radius² × height`.  

### Equilateral Pyramid:  
- The `EquilateralPyramid` class represents a **square-based equilateral pyramid**.  
- It contains attributes for:  
  - **Side** and **Height**.  
- Provides methods to:  
  - Calculate **area** as `base_area + lateral_surface_area`.  
  - Calculate **volume** as `(1/3) × base_area × height`.  

---

# Part 2: Shape Operations  

## Overview:  
The Shape Operations module provides methods for calculating various properties of geometric shapes. It includes operations such as calculating area, perimeter, and volume for different shape types.  

## Classes and Functions:  

### ShapeCalculator:  
- The `ShapeCalculator` class provides static methods to perform calculations.  
- It provides methods to:  
  - Compute **area** of a given shape.  
  - Compute **perimeter** of a given shape.  
  - Compute **volume** for applicable three-dimensional shapes.  

### Utility Functions:  
- Functions to:  
  - Validate **input dimensions** to ensure they are positive.  
  - Convert **units** for different measurement systems.  

---

# Part 3: Main Execution  

## Overview:  
The Main Execution module acts as the entry point for the program. It integrates the `Shape` and `ShapeCalculator` classes to demonstrate various functionalities such as:  
- Calculating shape properties.  
- Handling user input.  
- Displaying results in a structured format.  

## Classes and Functions:  

### Main:  
- The `Main` class drives the execution of the program.  
- It initializes instances of `Shape` and `ShapeCalculator` to:  
  - Create different shapes.  
  - Compute their **area**, **perimeter**, and **volume** (if applicable).  
  - Display results in a formatted output.  
