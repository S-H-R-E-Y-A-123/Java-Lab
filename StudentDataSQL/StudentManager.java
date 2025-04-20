import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class StudentManager {
    
    public void addStudent(Student s) throws DuplicatePRNException, InvalidPRNException, SQLException {
        if (s.getPrn().length() != 3)
            throw new InvalidPRNException("PRN must be 3 characters.");

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE prn = ?");
        ps.setString(1, s.getPrn());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            throw new DuplicatePRNException("PRN already exists.");
        }

        ps = con.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?)");
        ps.setString(1, s.getPrn());
        ps.setString(2, s.getName());
        ps.setString(3, s.getDob());
        ps.setInt(4, s.getMarks());
        ps.executeUpdate();
        con.close();
    }

    public void displayStudents() throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println("PRN: " + rs.getString("prn") +
                               ", Name: " + rs.getString("name") +
                               ", DoB: " + rs.getDate("dob") +
                               ", Marks: " + rs.getInt("marks"));
        }
        con.close();
    }

    public Student searchByPrn(String prn) throws StudentNotFoundException, SQLException {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE prn = ?");
        ps.setString(1, prn);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Student s = new Student(rs.getString("prn"), rs.getString("name"),
                    rs.getString("dob"), rs.getInt("marks"));
            con.close();
            return s;
        } else {
            con.close();
            throw new StudentNotFoundException("Student not found.");
        }
    }

    public List<Student> searchByName(String name) throws SQLException, InvalidNameException {
        if (name.length() < 2)
            throw new InvalidNameException("Name too short.");

        List<Student> list = new ArrayList<>();
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE name = ?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new Student(rs.getString("prn"), rs.getString("name"),
                    rs.getString("dob"), rs.getInt("marks")));
        }
        con.close();
        if (list.isEmpty()) throw new InvalidNameException("No student found.");
        return list;
    }

    public Student searchByIndex(int index) throws SQLException, IndexOutOfBoundsException {
        Connection con = DatabaseConnection.getConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        if (rs.absolute(index + 1)) {
            Student s = new Student(rs.getString("prn"), rs.getString("name"),
                    rs.getString("dob"), rs.getInt("marks"));
            con.close();
            return s;
        } else {
            con.close();
            throw new IndexOutOfBoundsException("Invalid index.");
        }
    }

    public void updateStudent(String prn, String newName, String newDob, int newMarks)
            throws SQLException, StudentNotFoundException, InvalidNameException {
        if (newName.length() < 2)
            throw new InvalidNameException("Invalid name.");

        searchByPrn(prn); // throws if not found

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name=?, dob=?, marks=? WHERE prn=?");
        ps.setString(1, newName);
        ps.setString(2, newDob);
        ps.setInt(3, newMarks);
        ps.setString(4, prn);
        ps.executeUpdate();
        con.close();
    }

    public void deleteStudent(String prn) throws SQLException, StudentNotFoundException {
        searchByPrn(prn); // throws if not found

        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE prn=?");
        ps.setString(1, prn);
        ps.executeUpdate();
        con.close();
    }
}
