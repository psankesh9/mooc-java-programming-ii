
public class Student {
    private int studentID;
    private String name;
    private University university; // Reference to the University class

    // Constructor
    public Student(int studentID, String name, University university) {
        this.studentID = studentID;
        this.name = name;
        this.university = university;
        // Add this student to the university's student list
        university.addStudent(this);
    }

    // Getter and Setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    // Method to get student details
    public String getDetails() {
        return "Student ID: " + studentID + ", Name: " + name + ", University: " + university.getName();
    }
}
