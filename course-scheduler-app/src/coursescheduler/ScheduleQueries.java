package coursescheduler;

import java.sql.*;
import java.util.ArrayList;

/**
 * Provides database access methods for managing student schedules.
 * Encapsulates SQL operations for inserting and retrieving schedule entries.
 */
public class ScheduleQueries {
    private static Connection connection;
    private static PreparedStatement addSchedule;
    private static PreparedStatement getScheduleByStudent;
    private static ResultSet resultSet;

    /**
     * Inserts a new schedule entry into the database.
     *
     * @param semester the semester of the schedule
     * @param courseCode the course code
     * @param studentID the student ID
     * @param status the registration status (e.g. enrolled, waitlisted)
     * @param timestamp the registration timestamp
     */
    public static void addSchedule(String semester, String courseCode, String studentID, String status, String timestamp) {
        connection = DBConnection.getConnection();
        try {
            addSchedule = connection.prepareStatement(
                "INSERT INTO app.schedule (semester, coursecode, studentid, status, timestamp) VALUES (?, ?, ?, ?, ?)");
            addSchedule.setString(1, semester);
            addSchedule.setString(2, courseCode);
            addSchedule.setString(3, studentID);
            addSchedule.setString(4, status);
            addSchedule.setString(5, timestamp);
            addSchedule.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Retrieves all schedule entries for a specific student in a given semester.
     *
     * @param semester the semester to search
     * @param studentID the student ID
     * @return a list of ScheduleEntry objects representing the student's schedule
     */
    public static ArrayList<ScheduleEntry> getScheduleByStudent(String semester, String studentID) {
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> results = new ArrayList<>();

        try {
            getScheduleByStudent = connection.prepareStatement(
                "SELECT coursecode, status, timestamp FROM app.schedule WHERE semester = ? AND studentid = ?");
            getScheduleByStudent.setString(1, semester);
            getScheduleByStudent.setString(2, studentID);
            resultSet = getScheduleByStudent.executeQuery();

            while (resultSet.next()) {
                results.add(new ScheduleEntry(
                    semester,
                    resultSet.getString("coursecode"),
                    studentID,
                    resultSet.getString("status"),
                    resultSet.getString("timestamp")
                ));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return results;
    }
}
