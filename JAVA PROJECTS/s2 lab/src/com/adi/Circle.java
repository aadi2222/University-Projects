package com.adi;
//SP20-BCS-055

public class Circle implements GeometricObject {

    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    public double getArea() {
        return 3.14*(radius*radius);
    }
}
