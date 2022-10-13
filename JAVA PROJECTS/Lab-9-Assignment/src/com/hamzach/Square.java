/*
 * SP20-BCS-082
 * Muhammad Hamza
 */
package com.hamzach;

public class Square extends Rectangle {

    //? Constructor
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
        setSide(side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        setSide(side);
    }

    //? Getter | Setters
    public double getSide() {
        return super.getLength(); //as both are equal
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
    }

    //? behaviour
    @Override
    public String toString() {
        return  "Square With side=" +
                + super.getLength() +
                " which is sub-class of " +
                super.toString();
    }
}
