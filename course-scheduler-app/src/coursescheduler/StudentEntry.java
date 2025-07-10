package coursescheduler;

/**
 * Represents a student in the Course Scheduler system.
 * Contains the student ID, first name, and last name.
 */
public class StudentEntry {
    private String studentID;
    private String firstName;
    private String lastName;

    /**
     * Constructs a StudentEntry with ID and name details.
     *
     * @param studentID the unique student identifier
     * @param firstName the student's first name
     * @param lastName the student's last name
     */
    public StudentEntry(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
