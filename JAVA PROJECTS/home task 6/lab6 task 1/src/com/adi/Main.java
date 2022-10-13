package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Student s1=new Student(input.nextLine(), input.nextFloat());
    Student.updateStaticLimit(50);
    s1.display();


    }
}
