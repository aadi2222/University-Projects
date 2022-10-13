package com.saad;
// Saad Mukhtar
//sp20-bcs-124
import java.util.Scanner;
public class HourlyEmployee extends Employee{
    private int hours;

    Scanner input=new Scanner(System.in);

    public HourlyEmployee(){
    super();
    }
    public HourlyEmployee(String name,int SSN,double hourlyIncome,Date birthdate) {
        super(name, SSN, hourlyIncome, birthdate);
        System.out.println("Enter total hours:");
        hours = input.nextInt();
    }
    @Override
    public double earnings(){
        if(hours <=40){
            return(hours *getHourlyIncome());
        }else{
         return ((hours *getHourlyIncome())+((hours -40)*getHourlyIncome()*1.5));
        }
    }

    public String toString(){
        return String.format("%s\nHours:%d\nHourly Income:%.2f$\nSALARY:%.2f$",super.toString(), hours,getHourlyIncome(),earnings());

    }

}
