//Shreya Chaturvedi; 23070126123; AIML B2

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        // Adding multiple students using do-while loop
        int count = 0;
        do {
            System.out.println("Enter name of student: ");
            String name = scan.nextLine();

            System.out.println("Enter PRN of student: ");
            long prn = Long.parseLong(scan.nextLine());

            System.out.println("Enter CGPA of student: ");
            double CGPA = Double.parseDouble(scan.nextLine());

            System.out.println("Enter Dept of student: ");
            String dept = scan.nextLine();

            System.out.println("Enter batch of student: ");
            String batch = scan.nextLine();

            Student student = new Student(name, prn, CGPA, dept, batch);
            operations.addStudent(student);
            count++;

            System.out.println("Do you want to add another student? (yes/no)");
        } while (scan.nextLine().equalsIgnoreCase("yes"));

        // Menu for operations
        while (true) {
            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Display Students");
            System.out.println("2. Search Student by PRN");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Search Student by Position");
            System.out.println("5. Update Student Details");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    operations.displayStudents();
                    break;

                case 2:
                    System.out.print("Enter PRN to search: ");
                    long prn = Long.parseLong(scan.nextLine());
                    Student studentPRN = operations.searchByPRN(prn);
                    if (studentPRN != null) studentPRN.display();
                    else System.out.println("Student not found.");
                    break;

                case 3:
                    System.out.print("Enter Name to search: ");
                    String name = scan.nextLine();
                    Student studentName = operations.searchByName(name);
                    if (studentName != null) studentName.display();
                    else System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter Position (Index) to search: ");
                    int pos = Integer.parseInt(scan.nextLine());
                    Student studentPos = operations.searchByPosition(pos);
                    if (studentPos != null) studentPos.display();
                    else System.out.println("Invalid position.");
                    break;

                case 5:
                    System.out.print("Enter PRN of student to update: ");
                    long updatePRN = Long.parseLong(scan.nextLine());
                    operations.updateStudent(updatePRN, scan);
                    break;

                case 6:
                    System.out.print("Enter PRN of student to delete: ");
                    long deletePRN = Long.parseLong(scan.nextLine());
                    operations.deleteStudent(deletePRN);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


