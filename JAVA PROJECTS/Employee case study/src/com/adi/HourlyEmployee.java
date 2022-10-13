package com.adi;
import java.util.Scanner;
public class HourlyEmployee extends Employee{

    private int totalHours;
    Scanner input=new Scanner(System.in);

    public HourlyEmployee(){
        super();
    }
    public HourlyEmployee(String name,int SSN,double hourlyIncome,Date birthdate) {
        super(name, SSN, hourlyIncome, birthdate);
        System.out.println("Enter total hours:");
        totalHours= input.nextInt();
    }
    @Override
    public double earnings(){
        if(totalHours<=40){
            return(totalHours*getHourlyIncome());
        }else{
         return ((totalHours*getHourlyIncome())+((totalHours-40)*getHourlyIncome()*1.5));
        }
    }

    public String toString(){
        return String.format("\nHourly %s\nTotal Hours:%d\nHourly Income:%.2f$\nEarnings:%.2f$",super.toString(),totalHours,getHourlyIncome(),earnings());

    }

}
