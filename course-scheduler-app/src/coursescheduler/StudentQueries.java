package coursescheduler;

import java.sql.*;
import java.util.ArrayList;

/**
 * Provides database access methods for managing students.
 * Encapsulates SQL operations for inserting and retrieving student records.
 */
public class StudentQueries {
    private static Connection connection;
    private static PreparedStatement addStudent;
    private static PreparedStatement getAllStudents;
    private static ResultSet resultSet;

    /**
     * Inserts a new student into the database.
     *
     * @param studentID the unique student identifier
     * @param firstName the student's first name
     * @param lastName the student's last name
     */
    public static void addStudent(String studentID, String firstName, String lastName) {
        connection = DBConnection.getConnection();
        try {
            addStudent = connection.prepareStatement(
                "INSERT INTO app.student (studentid, firstname, lastname) VALUES (?, ?, ?)");
            addStudent.setString(1, studentID);
            addStudent.setString(2, firstName);
            addStudent.setString(3, lastName);
            addStudent.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Retrieves all students from the database.
     *
     * @return a list of StudentEntry objects representing all students
     */
    public static ArrayList<StudentEntry> getAllStudents() {
        connection = DBConnection.getConnection();
        ArrayList<StudentEntry> results = new ArrayList<>();

        try {
            getAllStudents = connection.prepareStatement(
                "SELECT studentid, firstname, lastname FROM app.student");
            resultSet = getAllStudents.executeQuery();

            while (resultSet.next()) {
                results.add(new StudentEntry(
                    resultSet.getString("studentid"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname")
                ));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return results;
    }
}
