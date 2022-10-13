package com.adi;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> s=new ArrayList<>();

        s.add(new Rectangle());
        s.add((new Rectangle(10,20)));
        s.add(new Rectangle(10,20,"Red",true));

        s.add((new Square()));
        s.add(new Square(5));
        s.add(new Square(5,"blue",false));

        for (Shape shape:s){
            System.out.println("\n"+shape);
            System.out.println("Area:"+shape.getArea()+"\nPerimeter:"+shape.getPerimeter());
        }
    }
}
