package java2ddrawingapplication;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Abstract base class representing a generic shape.
 * Defines common properties like position and color.
 * Enforces implementation of the draw method in subclasses.
 */
public abstract class MyShapes {
    private int x1, y1, x2, y2;
    private Color color;

    /**
     * Constructs a shape with specified start and end coordinates and color.
     *
     * @param x1 starting x coordinate
     * @param y1 starting y coordinate
     * @param x2 ending x coordinate
     * @param y2 ending y coordinate
     * @param color the color of the shape
     */
    public MyShapes(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Draws the shape using the provided Graphics context.
     *
     * @param g the Graphics context
     */
    public abstract void draw(Graphics g);
}
