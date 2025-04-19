//Shreya Chaturvedi, 23070126123, AIML B2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add\n2. Display\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update\n7. Delete\n8. Exit");
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
                        System.out.print("Enter DoB: ");
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
                        s.display();
                        break;
                    case 4:
                        System.out.print("Enter Name: ");
                        List<Student> list = sm.searchByName(sc.nextLine());
                        for (Student st : list) st.display();
                        break;
                    case 5:
                        System.out.print("Enter Position: ");
                        int idx = sc.nextInt();
                        sm.searchByIndex(idx).display();
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
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
