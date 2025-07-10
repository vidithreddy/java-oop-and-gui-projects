package coursescheduler;

import java.sql.*;
import java.util.ArrayList;

/**
 * Provides database access methods for managing courses.
 * Encapsulates SQL operations for inserting and retrieving courses.
 */
public class CourseQueries {
    private static Connection connection;
    private static PreparedStatement insertCourse;
    private static PreparedStatement selectAllCourses;
    private static ResultSet resultSet;

    /**
     * Inserts a new course into the database.
     *
     * @param courseCode the unique code of the course
     * @param description the description of the course
     */
    public static void addCourse(String courseCode, String description) {
        connection = DBConnection.getConnection();
        try {
            insertCourse = connection.prepareStatement(
                    "INSERT INTO app.course (coursecode, description) VALUES (?, ?)");
            insertCourse.setString(1, courseCode);
            insertCourse.setString(2, description);
            insertCourse.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Retrieves all courses from the database.
     *
     * @return a list of CourseEntry objects representing all courses
     */
    public static ArrayList<CourseEntry> getAllCourses() {
        connection = DBConnection.getConnection();
        ArrayList<CourseEntry> results = new ArrayList<>();

        try {
            selectAllCourses = connection.prepareStatement(
                    "SELECT coursecode, description FROM app.course");
            resultSet = selectAllCourses.executeQuery();

            while (resultSet.next()) {
                results.add(new CourseEntry(
                        resultSet.getString("coursecode"),
                        resultSet.getString("description")
                ));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return results;
    }
}
