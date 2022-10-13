package com.adi;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> courses=new ArrayList<String>(5);
    private ArrayList<Float> marks=new ArrayList<Float>(5);
    static int passLimit;

    //Contructors
    public Student(String name, ArrayList<String> courses, ArrayList<Float> marks){
    this.name=name;
    this.courses=courses;
    this.marks=marks;

    }
    //methods
    public void printInfo(){
        for(String a:courses){
            System.out.printf("%s     ",a);
        }
        System.out.printf("\n");
        for (Float a:marks){
            System.out.printf("%.2f\t",a);
        }
    }
}
