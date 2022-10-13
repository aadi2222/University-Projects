package com.saad;
// Saad Mukhtar
//sp20-bcs-124
public class BasePlusCommissionEmployee extends Employee{
    private double comissionRate;
    private int grossSales;

    public BasePlusCommissionEmployee(int grossSales){
        super();
        this.grossSales=grossSales;
        comissionRate=4.5;
    }
    public double earnings(){
        return ((comissionRate*grossSales)+(180*getHourlyIncome()));
    }
    public String toString(){
        return String.format("%s\nGross Sales:%d\nCommision Rate:%.2f\nBase Salary:%.2f\nEarning:%.2f",super.toString(),grossSales,comissionRate,180*getHourlyIncome(),earnings());
    }
}
