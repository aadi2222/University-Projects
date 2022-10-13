package com.adi;

public class PermanentEmployee extends Employee{


    public PermanentEmployee(){
        super();
    }
    public PermanentEmployee(String name,int SSN,double hourlyIncome,Date birthdate) {
        super(name, SSN, hourlyIncome, birthdate);
    }
    @Override
    public double earnings(){
        return (180*getHourlyIncome());
    }
    public String toString(){
        return String.format("\nPermanent %s\nWeekly Salary:%.2f$",super.toString(),earnings());
    }
}
