package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double rad;
        double hi;
        System.out.println("Enter Radius:");
        rad= input.nextDouble();
        System.out.println("Enter Height:");
        hi= input.nextDouble();
    //Constructor 1 with no argument
	cylinder cylinder=new cylinder();
	cylinder.setRadius(rad);
	cylinder.setHeight(hi);
	System.out.println("Radius is="+cylinder.getRadius());
    System.out.println("Height is="+cylinder.getHeight());
    System.out.println("Area="+cylinder.getArea());
    System.out.println("Volume="+cylinder.getVolume());
    cylinder.Display();

    //Constructor 2 with one argument height and default value 1 for radius
    cylinder cylinder1=new cylinder(hi);
    cylinder1.setRadius(rad);
    System.out.println("Radius is="+cylinder1.getRadius());
    System.out.println("Height is="+cylinder1.getHeight());
    System.out.println("Area="+cylinder1.getArea());
    System.out.println("Volume="+cylinder1.getVolume());
    cylinder1.Display();

    //Constructor 3 with two arguments
    cylinder cylinder2=new cylinder(hi,rad);
    System.out.println("Radius is="+cylinder2.getRadius());
    System.out.println("Height is="+cylinder2.getHeight());
    System.out.println("Area="+cylinder2.getArea());
    System.out.println("Volume="+cylinder2.getVolume());
    cylinder2.Display();

    }
}
