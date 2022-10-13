package com.adi;

public class Employee {
    private String name;
    private int empID;
    private double hourlyIncome;

    public Employee(){
        name="AADI";
        empID=321;
        hourlyIncome=10;
    }
    public Employee(String name,int empID,double hourlyIncome){
        this.empID=empID;
        this.name=name;
        this.hourlyIncome=hourlyIncome;
    }
    public double earnings(){
        return 0;
    }
    public String toString(){
        return String.format("Employee:%s (ID: %d)\nIncome=%f$",name,empID,earnings());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }
}
