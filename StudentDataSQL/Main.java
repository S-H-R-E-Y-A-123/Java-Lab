// Shreya Chaturvedi, 23070126123, AIML B2

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;

        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. Display Details");
            System.out.println("3. Search Details by PRN");
            System.out.println("4. Search Details by Name");
            System.out.println("5. Search Details by Index Position");
            System.out.println("6. Update Details");
            System.out.println("7. Delete Details");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter PRN: ");
                        String prn = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter DoB (YYYY-MM-DD): ");
                        String dob = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();
                        sm.addStudent(new Student(prn, name, dob, marks));
                        break;
                    case 2:
                        sm.displayStudents();
                        break;
                    case 3:
                        System.out.print("Enter PRN: ");
                        Student s = sm.searchByPrn(sc.nextLine());
                        System.out.println("PRN: " + s.getPrn() + ", Name: " + s.getName() + ", DoB: " + s.getDob() + ", Marks: " + s.getMarks());
                        break;
                    case 4:
                        System.out.print("Enter Name: ");
                        List<Student> found = sm.searchByName(sc.nextLine());
                        for (Student st : found) {
                            System.out.println("PRN: " + st.getPrn() + ", Name: " + st.getName() + ", DoB: " + st.getDob() + ", Marks: " + st.getMarks());
                        }
                        break;
                    case 5:
                        System.out.print("Enter Index: ");
                        Student student = sm.searchByIndex(sc.nextInt());
                        System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DoB: " + student.getDob() + ", Marks: " + student.getMarks());
                        break;
                    case 6:
                        System.out.print("Enter PRN to update: ");
                        prn = sc.nextLine();
                        System.out.print("Enter new Name: ");
                        name = sc.nextLine();
                        System.out.print("Enter new DoB: ");
                        dob = sc.nextLine();
                        System.out.print("Enter new Marks: ");
                        marks = sc.nextInt();
                        sm.updateStudent(prn, name, dob, marks);
                        break;
                    case 7:
                        System.out.print("Enter PRN to delete: ");
                        sm.deleteStudent(sc.nextLine());
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
