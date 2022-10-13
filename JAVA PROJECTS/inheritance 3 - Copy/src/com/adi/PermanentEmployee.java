package com.adi;

public class PermanentEmployee extends Employee{


    public PermanentEmployee(){
        super();
    }
    public PermanentEmployee(String name,int empID,double hourlyIncome) {
        super(name, empID, hourlyIncome);
    }
    @Override
    public double earnings(){
        return (180*getHourlyIncome());
    }
    public String toString(){
        return super.toString();
    }
}
