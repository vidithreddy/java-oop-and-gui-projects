package coursescheduler;

/**
 * Represents a schedule entry for a student in a specific semester and course.
 * Contains student ID, course code, semester, registration status, and timestamp.
 */
public class ScheduleEntry {
    private String semester;
    private String courseCode;
    private String studentID;
    private String status;
    private String timestamp;

    /**
     * Constructs a ScheduleEntry with all details.
     *
     * @param semester the semester of the schedule
     * @param courseCode the course code
     * @param studentID the student ID
     * @param status the registration status (e.g. enrolled, waitlisted)
     * @param timestamp the registration timestamp
     */
    public ScheduleEntry(String semester, String courseCode, String studentID, String status, String timestamp) {
        this.semester = semester;
        this.courseCode = courseCode;
        this.studentID = studentID;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
