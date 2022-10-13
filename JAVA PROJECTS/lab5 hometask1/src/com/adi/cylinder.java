package com.adi;

public class cylinder {
    private float radius;
    private double height;
    public cylinder(){}
    public cylinder(double hi){
        height=hi;
        radius=1.5f;
    }
    public cylinder(float rad){
        height=2;
        radius=rad;
    }
    public cylinder(double hi,float rad){
        height=hi;
        radius=rad;
    }
    public cylinder(float rad,double hi){
        height=hi;
        radius=rad;
    }
    public void setRadius(float rad){
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
    public void setCylinderData(){
        radius=2.1f;
        height=2;
    }
    public void setCylinderData(double hi){
        radius=2.1f;
        height=hi;
    }
    public void setCylinderData(double hi, float rad){
        height=hi;
        radius=rad;
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


