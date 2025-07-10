package coursescheduler;

/**
 * Represents a course in the scheduling system.
 * Contains the course code and description.
 */
public class CourseEntry {
    private String courseCode;
    private String courseDescription;

    /**
     * Constructs a CourseEntry with a code and description.
     *
     * @param courseCode the unique code for the course
     * @param courseDescription a brief description of the course
     */
    public CourseEntry(String courseCode, String courseDescription) {
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }
}
