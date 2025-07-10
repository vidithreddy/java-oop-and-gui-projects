package java2ddrawingapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Represents a bounded shape (like rectangle or oval) that can be filled or outlined.
 * Extends MyShapes to add the filled property and custom drawing logic.
 */
public class MyBoundedShapes extends MyShapes {
    private boolean filled;

    /**
     * Constructs a MyBoundedShapes object with position, color, and fill state.
     *
     * @param x1 starting x coordinate
     * @param y1 starting y coordinate
     * @param x2 ending x coordinate
     * @param y2 ending y coordinate
     * @param color the color of the shape
     * @param filled whether the shape is filled
     */
    public MyBoundedShapes(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color);
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Draws the shape on the given Graphics context.
     * If filled is true, fills the shape; otherwise draws the outline.
     *
     * @param g the Graphics context
     */
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());

        int x = Math.min(getX1(), getX2());
        int y = Math.min(getY1(), getY2());
        int width = Math.abs(getX1() - getX2());
        int height = Math.abs(getY1() - getY2());

        if (filled) {
            g2d.fillRect(x, y, width, height);
        } else {
            g2d.drawRect(x, y, width, height);
        }
    }
}
