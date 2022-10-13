package com.hamzach;

public class Rectangle extends Shape {

    private double width;
    private double height;

    //? Constructor
    public  Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void computeArea() {
        System.out.println("Area of Rectangle: "+ (height*width) + " " + unitM);
    }
    public void reset() {
        width  = 0;
        height = 0;
    }
}
