package com.adi;

public class box {
    private double length;
    private double width;
    private double height;

    public box(){
    length=2.0;
    height=3.0;
    width=4.0;
    }
    public box(double length){
        this.length=length;
        height=3.0;
        width=4.0;
    }
    public box(double length,double width){
        this.length=length;
        this.width=width;
        height=3.0;
    }
    public box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public box(box b){
        length=b.length;
        width=b.width;
        height=b.height;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setBox(){
        length=2.0;
        height=3.0;
        width=4.0;
    }
    public void setBox(double length){
        this.length=length;
        height=3.0;
        width=4.0;
    }
    public void setBox(double length,double width){
        this.length=length;
        this.width=width;
        height=3.0;
    }
    public void setBox(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double Volume(){
        return(length*height*width);
    }
    public void display(){
        System.out.println("Length="+length);
        System.out.println("Height="+height);
        System.out.println("Width="+width);
        System.out.println("Volume="+Volume());
    }
    public box innerBox() {
         box bx=new box(length+10,width+10,height+10);
         return bx;
    }
}
