package com.adi;
import java.util.Scanner;
public class HourlyEmployee extends Employee{
    private double totalHours;
    Scanner input=new Scanner(System.in);

    public HourlyEmployee(){
    super();
    }
    public HourlyEmployee(String name,int empID,double hourlyIncome){
        super(name, empID, hourlyIncome);
        System.out.println("Enter total hours:");
        totalHours= input.nextDouble();
    }
    @Override
    public double earnings(){
        return (totalHours*getHourlyIncome());
    }

    public String toString(){
        return super.toString();
    }

}
