package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height;
        double width;
        double length;
        System.out.println("Enter Length:");
        length = input.nextDouble();
        System.out.println("Enter Width:");
        width = input.nextDouble();
        System.out.println("Enter Height:");
        height = input.nextDouble();
        box box1 = new box();
        box1.setBox();
        box1.setBox(length);
        box1.setBox(length, width);
        box1.setBox(length, width, height);
        box1.display();
        box1.Volume();
        box box2 = new box(length);
        box2.setBox();
        box2.setBox(length);
        box2.setBox(length, width);
        box2.setBox(length, width, height);
        box2.display();
        box2.Volume();
        box box3=new box(length,width);
        box3.setBox();
        box3.setBox(length);
        box3.setBox(length, width);
        box3.setBox(length, width, height);
        box3.display();
        box3.Volume();
        box box4=new box(length,width,height);
        box4.setBox();
        box4.setBox(length);
        box4.setBox(length, width);
        box4.setBox(length, width, height);
        box4.display();
        box4.Volume();
        box box5=new box(box1);
        box5.setBox();
        box5.setBox(length);
        box5.setBox(length, width);
        box5.setBox(length, width, height);
        box5.display();
        box5.Volume();
        box box6= box5.innerBox();
        box6.display();
    }

}
