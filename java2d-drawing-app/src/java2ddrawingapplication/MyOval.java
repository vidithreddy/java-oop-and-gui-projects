package java2ddrawingapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Represents an oval shape that can be filled or outlined.
 * Extends MyBoundedShapes to leverage filled property and custom drawing logic.
 */
public class MyOval extends MyBoundedShapes {

    /**
     * Constructs a MyOval with position, color, and fill state.
     *
     * @param x1 starting x coordinate
     * @param y1 starting y coordinate
     * @param x2 ending x coordinate
     * @param y2 ending y coordinate
     * @param color the color of the oval
     * @param filled whether the oval is filled
     */
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    }

    /**
     * Draws the oval on the given Graphics context.
     * Fills the oval if filled is true; otherwise draws the outline.
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

        if (isFilled()) {
            g2d.fillOval(x, y, width, height);
        } else {
            g2d.drawOval(x, y, width, height);
        }
    }
}
