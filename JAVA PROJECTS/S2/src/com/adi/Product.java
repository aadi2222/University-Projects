package com.adi;
//SP20-BCS-055
public class Product implements Billing {
    //SP20-BCS-055
    private int pID;
    private String pName;
    private double pPrice;
    private static int incr;

    public Product(String pName,double pPrice){
        pID=++incr;
        this.pName=pName;
        this.pPrice=pPrice;
    }
    public Product(){
        this("no item",0.0);
    }

    public double getpPrice() {
        return pPrice;
    }
    //set/get methods
    public int getpID(){
        return pID;
    }
    public String getpName(){
        return pName;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }
    public double purchaseBill(){
        return 1;
    }
    public static double purchaseBill(Billing[]items){
        double total=0;
        for (Billing item:items){
            total=total+ item.purchaseBill();
        }
        return total;

    }

    @Override
    public String toString(){
        return String.format("ID=%d/tName=%s/tPrice=%f",pID,pName,pPrice);
    }
}
