package com.adi;

public class Employee {
    private String Name;
    private double Salary;
    private double netMonthlyIncome;
    static int annualTaxRate;
    static float infaltionRate=0.3f;
    static {
        if (infaltionRate>0.5)
            annualTaxRate=5;
        else
            annualTaxRate=10;
    }

    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public Employee(String Name,double Salary){
        this.Name=Name;
        this.Salary=Salary;
    }
    public Employee(String Name){
        this.Name=Name;
        Salary=30000;
    }
    public double computeAnnualTax(){
        return ((Salary*12*annualTaxRate)/100);
    }
    public double computeNetSalary(){
        netMonthlyIncome=Salary-(computeAnnualTax()/12);
        return netMonthlyIncome;
    }
    public void display(){
        System.out.println("Name:"+Name);
        System.out.println("Salary:"+Salary);
        System.out.println("Monthly Net Salary: " + computeNetSalary());
        System.out.println("Annual Tax :"+computeAnnualTax());
    }
}
