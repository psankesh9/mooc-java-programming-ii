import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students; // Collection of Student objects

    // Constructor
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Method to add a student to the university
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Method to get university details
    public String getDetails() {
        return "Name: " + name + ", Students: " + students.size();
    }
}
