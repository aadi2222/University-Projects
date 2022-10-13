package com.adi;

public class Rectangle extends Shape{
    private double width;
    private double length;


    public Rectangle(){
        super();
        width=1;
        length=1;
    }
    public Rectangle(double width,double length){
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String colour,boolean filled){
        super(colour, filled);
        this.length=length;
        this.width=width;
    }


    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    @Override
    public String toString(){
        return String.format("A rectangle with Width:%.2f and Length:%.2f which is subclass of %s.",width,length,super.toString());
    }

    @Override
    public void computeArea() {
        System.out.println("Area:"+(length*width)+units);
        return;
    }

    @Override
    public void reset() {
        setLength(0);
        setWidth(0);
        System.out.println("Reset to 0");
    }
}
