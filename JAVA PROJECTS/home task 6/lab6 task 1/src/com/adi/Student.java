package com.adi;

public class Student {
    private String name;
    private float marks;
    static int passLimit=33; //inline initializiation
    static {
        System.out.println("Enter your Name and Marks");
    }
    static void updateStaticLimit(int pass){
        passLimit=pass;
    }
    public boolean isPassed(){
       return (marks>=passLimit);
    }
    public void display(){
        System.out.println("Student Name:"+name);
        System.out.println(("Marks:"+marks));
        System.out.println("Pass limit:"+passLimit);
        System.out.println(isPassed()?"Student is Passed":"Student is failed");
    }
    public Student(String name,float marks){
        this.name=name;
        this.marks=marks;
    }
}
