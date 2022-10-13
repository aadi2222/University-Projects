package com.adi;

public class ComissionEmployee extends Employee{
    private double comissionRate;
    private int grossSales;

    public ComissionEmployee(int grossSales,double comissionRate){
        super();
        this.grossSales=grossSales;
        this.comissionRate=comissionRate;
    }
    public ComissionEmployee(String name,int empID,double hourlyIncome,double comissionRate,int grossSales,Date birthdate){
        super(name, empID, hourlyIncome, birthdate);
        this.grossSales=grossSales;
        this.comissionRate=comissionRate;
    }
    public double earnings(){
        return (comissionRate*grossSales);
    }
    public String toString(){
        return String.format("\nCommission %s\nGross Sales:%d\nCommision Rate:%.2f\nEarning:%.2f",super.toString(),grossSales,comissionRate,earnings());
    }


}
