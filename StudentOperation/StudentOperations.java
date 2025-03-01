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
}
