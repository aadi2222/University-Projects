package com.saad;
// Saad Mukhtar
//sp20-bcs-124
public class ComissionEmployee extends Employee{
    private double comissionRate;
    private int grossSales;

    public ComissionEmployee(int grossSales){
        super();
        this.grossSales=grossSales;
        comissionRate=4.5;
    }
    public double earnings(){
        return (comissionRate*grossSales);
    }
    public String toString(){
        return String.format("%s\nGross Sales:%d\nCommision Rate:%.2f\nSALARY:%.2f",super.toString(),grossSales,comissionRate,earnings());
    }


}
