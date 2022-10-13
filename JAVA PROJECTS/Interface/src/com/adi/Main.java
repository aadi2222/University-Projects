package com.adi;
import java.util.ArrayList;
public class Main {

        static void printStats(Stats i ){
            i.computeArea();
            i.reset();
    }

    public static void main(String[] args) {

        ArrayList<Stats> s=new ArrayList<>();

        s.add(new Rectangle());
        s.add((new Rectangle(10,20)));
        s.add(new Rectangle(10,20,"Red",true));

        s.add((new Square()));
        s.add(new Square(5));
        s.add(new Square(5,"blue",false));

        s.add(new Country());
        s.add(new Country());


        for (Stats shape:s){
            printStats(shape);

            /* System.out.println("\n"+shape);
            System.out.println("Area:"+shape.getArea()+"\nPerimeter:"+shape.getPerimeter());

           if(shape instanceof Square){
                System.out.println("Old area of Square:"+shape.getArea());
                Square sh=(Square)shape;
               // System.out.println(sh.getLength());
                sh.setLength(sh.getLength()+10);
                sh.setWidth(sh.getLength());
                //System.out.println(sh.getLength());
                System.out.println("New Area of Square:"+sh.getArea());
            }*/
        }
    }
}
