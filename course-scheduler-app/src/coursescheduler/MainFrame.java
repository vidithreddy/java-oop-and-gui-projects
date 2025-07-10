package coursescheduler;

import javax.swing.*;

/**
 * Main application window for the Course Scheduler.
 * Sets up the Swing GUI for managing courses, students, and schedules.
 */
public class MainFrame extends JFrame {

    /**
     * Constructs the main application frame.
     * Initializes the Swing components.
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * Initializes the form components.
     * Placeholder for GUI layout and controls.
     */
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Scheduler");

        pack();
    }

    /**
     * Entry point of the application.
     * Launches the main frame in the event dispatch thread.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
