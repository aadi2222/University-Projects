/*
 * SP20-BCS-082
 * Muhammad Hamza
 */
package com.hamzach;

public class Shape {
    private String color;
    private boolean filled;

    //? Constructor
    public Shape() {
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //? Getter | Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //? behaviour
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
    @Override
    public String toString() {
        return "Shape " + (isFilled() ? "Filled" : "Not Filled") +
                " With " + color + " color";
    }
}
