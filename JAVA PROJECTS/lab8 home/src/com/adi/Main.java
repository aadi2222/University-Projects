package com.adi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int i=0;
        float j=0;
        ArrayList<String> courses=new ArrayList<String>(5);
        ArrayList<Float> marks=new ArrayList<Float>(5);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name=input.nextLine();
        while(i<5){
            System.out.println("Enter Course No."+(i+1)+":");
            courses.add(input.nextLine());
            i++;
        }
        i=0;
        while(j>=0){

            System.out.println("Enter marks of course"+(i+1)+":");
            j= input.nextFloat();
            if(j<0){
                break;
            }
            marks.add(j);
            i++;
        }
        Student s1=new Student(name,courses,marks);
        s1.printInfo();
    }

}
