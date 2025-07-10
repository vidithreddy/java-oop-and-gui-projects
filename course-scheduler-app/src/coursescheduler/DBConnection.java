package coursescheduler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Manages the database connection for the Course Scheduler application.
 * Provides a single shared connection using the Derby embedded database.
 */
public class DBConnection {
    private static Connection connection;

    /**
     * Returns the shared database connection instance.
     * If not already established, creates a new connection to the Derby database.
     *
     * @return the database connection
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/CourseSchedulerDB;create=true");
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return connection;
    }
}
