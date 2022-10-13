package com.adi;

public class BasePlusCommissionEmployee extends Employee{
    private double comissionRate;
    private int grossSales;

    public BasePlusCommissionEmployee(int grossSales,double comissionRate){
        super();
        this.grossSales=grossSales;
        this.comissionRate=comissionRate;
    }
    public BasePlusCommissionEmployee(String name,int empID,double hourlyIncome,double comissionRate,int grossSales,Date birthdate){
        super(name, empID, hourlyIncome, birthdate);
        this.grossSales=grossSales;
        this.comissionRate=comissionRate;
    }
    public double earnings(){
        return ((comissionRate*grossSales)+(180*getHourlyIncome()));
    }
    public String toString(){
        return String.format("\nBasePlusCommission %s\nGross Sales:%d\nCommision Rate:%.2f\nBase Salary:%.2f\nEarning:%.2f",super.toString(),grossSales,comissionRate,180*getHourlyIncome(),earnings());
    }
}
