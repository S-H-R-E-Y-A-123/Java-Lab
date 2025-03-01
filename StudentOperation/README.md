# Part 1: Student Data Management

## Overview:
The Student Data Management module provides a structured way to handle student records using Java. It allows users to store, modify, and retrieve student details, including PRN, name, CGPA, department, and batch. Various operations such as adding students, displaying student details, searching, updating, and deleting student records are supported.

## Classes and Functions:

### Student:
The `Student` class defines the attributes and methods for managing student details.

#### Functions:
- `Student(String name, long prn, double CGPA, String dept, String batch)`: Constructor to initialize student attributes.
- `getName()`: Returns the name of the student.
- `setName(String name)`: Updates the student's name.
- `getPRN()`: Returns the PRN of the student.
- `setPRN(long prn)`: Updates the PRN.
- `getCGPA()`: Returns the CGPA of the student.
- `setCGPA(double CGPA)`: Updates the CGPA.
- `getDept()`: Returns the department of the student.
- `setDept(String dept)`: Updates the department.
- `getBatch()`: Returns the batch of the student.
- `setBatch(String batch)`: Updates the batch.
- `display()`: Prints the student's details.

---

# Part 2: Student Operations

## Overview:
The Student Operations module provides methods for managing an array of `Student` objects. It supports adding new students, displaying student details, searching by PRN, name, or position, updating student records, and deleting students.

## Classes and Functions:

### StudentOperations:
The `StudentOperations` class manages a list of students and provides various functionalities.

#### Functions:
- `StudentOperations()`: Initializes an empty list of students.
- `addStudent(Student student)`: Adds a new student to the list.
- `displayStudents()`: Displays details of all students.
- `searchByPRN(long prn)`: Searches for a student by PRN and returns the student if found.
- `searchByName(String name)`: Searches for students by name and returns matching students.
- `searchByPosition(int index)`: Returns the student at a given position in the list.
- `updateStudent(long prn, Student newStudentData)`: Updates student details based on PRN.
- `deleteStudent(long prn)`: Removes a student from the list by PRN.

---

# Part 3: Main Execution

## Overview:
The Main Execution module serves as the entry point of the program. It facilitates interaction between the user and the `StudentOperations` class. The program takes user input for student details, performs various operations, and displays results accordingly.

## Classes and Functions:

### Main:
The `Main` class handles user input and calls `StudentOperations` functions to perform required tasks.

#### Functions:
- Initializes an instance of `StudentOperations`.
- Uses a loop to collect multiple student records from the user.
- Calls `addStudent()` to store student data.
- Calls `displayStudents()` to show all stored records.
- Provides options for searching, updating, and deleting student records.

---

## How to Run:
1. Compile all Java files using `javac Main.java Student.java StudentOperations.java`.
2. Run the program using `java Main`.
3. Follow the on-screen instructions to add, search, update, or delete students.



