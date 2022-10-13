package com.adi;

public abstract class Employee {
    private String name;
    private int SSN;
    private double hourlyIncome;
    private Date birthdate;

    public Employee(){
        name="xyz";
        SSN =4321;
        hourlyIncome=40;
        birthdate=new Date(17,9,1995);
    }
    public Employee(String name,int empID,double hourlyIncome,Date birthdate){
        this.SSN =empID;
        this.name=name;
        this.hourlyIncome=hourlyIncome;
        this.birthdate=birthdate;
    }
    public double earnings(){
        return 0;
    }
    public String toString(){
        return String.format("Employee:%s \nSocial Security Number: %d",name, SSN);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return SSN;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }
}
