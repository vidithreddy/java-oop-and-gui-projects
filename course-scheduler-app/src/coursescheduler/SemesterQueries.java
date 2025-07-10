package coursescheduler;

import java.sql.*;
import java.util.ArrayList;

/**
 * Provides database access methods for managing semesters.
 * Encapsulates SQL operations for inserting and retrieving semester records.
 */
public class SemesterQueries {
    private static Connection connection;
    private static PreparedStatement addSemester;
    private static PreparedStatement getSemesterList;
    private static ResultSet resultSet;

    /**
     * Inserts a new semester into the database.
     *
     * @param semester the semester to add
     */
    public static void addSemester(String semester) {
        connection = DBConnection.getConnection();
        try {
            addSemester = connection.prepareStatement(
                "INSERT INTO app.semester (semester) VALUES (?)");
            addSemester.setString(1, semester);
            addSemester.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Retrieves the list of all semesters from the database, ordered alphabetically.
     *
     * @return a list of semester names
     */
    public static ArrayList<String> getSemesterList() {
        connection = DBConnection.getConnection();
        ArrayList<String> results = new ArrayList<>();

        try {
            getSemesterList = connection.prepareStatement(
                "SELECT semester FROM app.semester ORDER BY semester");
            resultSet = getSemesterList.executeQuery();

            while (resultSet.next()) {
                results.add(resultSet.getString("semester"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return results;
    }
}
