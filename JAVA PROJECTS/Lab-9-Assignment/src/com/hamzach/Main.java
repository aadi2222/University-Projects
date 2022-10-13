/*
 * SP20-BCS-082
 * Muhammad Hamza
 */
package com.hamzach;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();


        shapes.add(new Rectangle());
        shapes.add(new Rectangle(20.0, 30.0));
        shapes.add(new Rectangle(40.0, 50.0, "red", false));
        shapes.add(new Square());
        shapes.add(new Square(20.0));
        shapes.add(new Square(30.0, "pink", true));

        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("Area " + shape.getArea() + " Perimeter " + shape.getPerimeter());
        }

    /*
    *    1.	Remove the no-argument constructor of shape class. Rerun your test class. Is there any error? Why?
    *
    *    When we remove the constructor of shape class it didn't effect the shape class.
    *    the reason of error is we are using Shape no argument constructor in his child class Rectangle to initialize values of instances in super_class (Shape)
    *
    *    2.	Remove all the constructors from each class, except the two-argument constructor from the shape class and no-argument constructors from the Rectangle and Square classes. Is there any error? Why?
    *
    *    In this case Shape and Square are fine but we are facing error in Rectangle class because it is using
    *    the constructor of Shape class (No argument) which we removed
    *
    */
    }
}
