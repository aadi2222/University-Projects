/*
 * SP20-BCS-082
 * Muhammad Hamza
 */
package com.hamzach;

public class Rectangle extends Shape {
    private double width;
    private double length;

    //? Constructor
    public  Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //? Getter | Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //? behaviour
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle with " +
                "width=" + width +
                ", length=" + length +
                " which is sub-class of " + super.toString();
    }

}
