package com.adi;

public class circle {
    double radius;
    public void setRadius(double rad){
     radius = rad;
    }
    public double getRadius(){

        return radius;

    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public double perimeter(){

        return (Math.PI * 2 * radius);

    }
}
