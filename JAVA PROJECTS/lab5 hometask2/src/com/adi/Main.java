package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        date d1=new date();
        date d2=new date(21,04,23);
        System.out.println("Enter Year/Month/Day in same format:");
        d2.setDate(input.nextInt(), input.nextInt(), input.nextInt());
        date d3,d4;
        d1.display();
        d2.display();
        d3=d2;
        d4=d3;

        d3.setMonth(04);
        d1.display();
        d2.display();
        d3.display();
        d4.display();


    }
}
