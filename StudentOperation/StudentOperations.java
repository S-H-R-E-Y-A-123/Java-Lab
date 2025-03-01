import java.util.*;

class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added.");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    // Search student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

    // Search student by Name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Search student by Position (Index)
    public Student searchByPosition(int pos) {
        if (pos >= 0 && pos < students.size()) {
            return students.get(pos);
        }
        return null;
    }
    
    // Update student details
    public boolean updateStudent(long prn, Scanner scan) {
        Student student = searchByPRN(prn);
        if (student == null) {
            System.out.println("Student with PRN " + prn + " not found.");
            return false;
        }

        System.out.println("Enter new name: ");
        student.setName(scan.nextLine());

        System.out.println("Enter new CGPA: ");
        student.setCGPA(Double.parseDouble(scan.nextLine()));

        System.out.println("Enter new department: ");
        student.setDept(scan.nextLine());

        System.out.println("Enter new batch: ");
        student.setBatch(scan.nextLine());

        System.out.println("Student details updated successfully!");
        return true;
    }
}

