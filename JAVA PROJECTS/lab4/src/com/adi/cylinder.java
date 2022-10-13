package com.adi;

public class cylinder {
    private double radius;
    private double height;

    public cylinder(){}
    public cylinder(double hi){
        height=hi;
        radius=1;
    }
    public cylinder(double rad,double hi){
        height=hi;
        radius=rad;
    }
    public void setRadius(double rad){
        radius=rad;
    }
    public void setHeight(double hi){
        height=hi;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){ // A=2πrh+2πr2
        return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
    }
    public double getVolume(){ //V=πr2h
        return (Math.PI*radius*radius*height);
    }
    public void Display(){
        System.out.printf("Height of Cylinder=%.2f\n",height);
        System.out.printf("Radius of Cylinder=%.2f\n",radius);
        System.out.printf("Area of Cylinder=%.2f\n",getArea());
        System.out.printf("Volume of Cylinder=%.2f\n",getVolume());
    }

}
