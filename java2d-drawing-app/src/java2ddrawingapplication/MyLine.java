package java2ddrawingapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Represents a straight line shape.
 * Extends MyShapes to provide specific drawing logic for lines.
 */
public class MyLine extends MyShapes {

    /**
     * Constructs a MyLine with start and end coordinates and a color.
     *
     * @param x1 starting x coordinate
     * @param y1 starting y coordinate
     * @param x2 ending x coordinate
     * @param y2 ending y coordinate
     * @param color the color of the line
     */
    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    }

    /**
     * Draws the line on the given Graphics context.
     *
     * @param g the Graphics context
     */
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        g2d.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
