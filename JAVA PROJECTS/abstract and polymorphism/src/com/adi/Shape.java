package com.adi;

public abstract class Shape {
    public String colour;
    public boolean filled;

    public Shape(){
        colour="green";
        filled=true;
    }
    public Shape(String colour,boolean filled){
        this.colour=colour;
        this.filled=filled;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColour() {
        return colour;
    }
    public boolean isFilled() {
        return filled;
    }


    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return String.format("Shape is %s with %s colour",(isFilled() ? "Filled" : "Not Filled"),colour);
    }
}
