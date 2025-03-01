# Duck Project 

The **Duck Project** is designed to simulate various duck behaviors, including movement and sound generation. It follows an object-oriented approach to model different types of ducks with unique characteristics.

---

## Part 1: Duck Representation

### Overview

The **Duck Representation** module defines the structure of a duck. Each duck has specific attributes and behaviors that allow it to interact with the environment.

### Classes and Functions

#### `Duck`
The `Duck` class serves as the base class for all ducks.

- **Attributes:**
  - `name`: The name of the duck.
  - `color`: The color of the duck.
  - `size`: The size category of the duck (small, medium, large).

- **Methods:**
  - `quack()`: Generates a quacking sound.
  - `swim()`: Simulates the duck swimming.
  - `display()`: Prints the duck’s attributes.

---

## Part 2: Duck Behavior

### Overview

The **Duck Behavior** module extends the base `Duck` class to introduce unique behaviors. Different types of ducks inherit from the base class, each with their own variations.

### Classes and Functions

#### `MallardDuck` (inherits from `Duck`)
- Overrides `quack()` to produce a distinct *Mallard* sound.
- Has unique coloring and size attributes.

#### `RubberDuck` (inherits from `Duck`)
- Overrides `quack()` to produce a squeaking sound instead of a real quack.
- Cannot swim but floats on water.

#### `DecoyDuck` (inherits from `Duck`)
- Does not quack or swim, serving as a motionless decoy.

---

## Part 3: Main Execution

### Overview

The **Main Execution** module serves as the entry point for the program. It integrates the `Duck` class and its variations to simulate different duck behaviors.

### Classes and Functions

#### `Main`
- The `Main` class drives program execution.
- It creates instances of different duck types to:
  - Display their attributes.
  - Simulate their unique quacking sounds.
  - Test their swimming abilities.

---

