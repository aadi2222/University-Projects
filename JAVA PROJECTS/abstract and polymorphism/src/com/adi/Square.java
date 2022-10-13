package com.adi;

public class Square extends Rectangle{

    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String colour,boolean filled){
        super(side,side,colour,filled);
    }


    @Override
    public String toString(){
        return String.format("A square with Side:%.2f which is a subclass of %s",super.getLength(),super.toString());

    }
}
