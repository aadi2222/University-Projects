package com.adi;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float rad;
        double hi;
        System.out.println("Enter Radius:");
        rad= input.nextFloat();
        System.out.println("Enter Height:");
        hi= input.nextDouble();

        cylinder cylinder=new cylinder();
        cylinder.setRadius(rad);
        cylinder.setHeight(hi);
        cylinder.Display();

        System.out.println("----------->Calling Constructors<-----------");
        cylinder cylinder1=new cylinder(hi);
        cylinder1.setRadius(rad);
        cylinder1.Display();

        cylinder cylinder2=new cylinder(rad);
        cylinder2.Display();

        cylinder cylinder3=new cylinder(hi,rad);
        cylinder3.Display();

        cylinder cylinder4=new cylinder(rad,hi);
        cylinder4.Display();

        System.out.println("----------->Calling Methods<-----------");
        cylinder1.setCylinderData();
        cylinder1.Display();
        cylinder2.setCylinderData(3);
        cylinder2.Display();
        cylinder3.setCylinderData(3,4);
        cylinder3.Display();

    }
}

