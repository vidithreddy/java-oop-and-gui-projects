package java2ddrawingapplication;

import javax.swing.*;

/**
 * Main application frame for the Java 2D Drawing Application.
 * Serves as the primary window containing GUI components, listeners, and the drawing area.
 */
public class DrawingApplicationFrame extends JFrame {

    /**
     * Constructs the main application window with a predefined size and title.
     * Intended to contain the layout, panels, and drawing tools for the application.
     */
    public DrawingApplicationFrame() {
        super("Java 2D Drawing Application");

        // TODO: Add GUI components, event listeners, and drawing area here

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
}
