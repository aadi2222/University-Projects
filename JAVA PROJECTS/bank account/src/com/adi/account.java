package com.adi;

public class account {
    private int AccId;
    private String AccName;
    private String AccType;
    private double AccBalance;
 public void setAccId(int x){
     AccId=x;
 }
 public void setAccName(String y){
     AccName=y;
 }
 public void setAccType(String z){
     AccType=z;
 }
    public void setAccBalance(double i){
        AccBalance=i;
    }
    public int getAccId(){
     return(AccId);
    }
    public String getAccName(){
        return (AccName);
    }
    public String getAccType(){
     return (AccType);
    }
    public double getAccBalance(){
     return (AccBalance);
    }
    public void deposit(double amount){
     AccBalance=AccBalance+amount;
        System.out.println("Your New ACCOUNT Balance="+AccBalance);
    }
    public void display(){
        System.out.println("ACCOUNT ID="+AccId);
        System.out.println("ACCOUNT Name="+AccName);
        System.out.println("ACCOUNT Type="+AccType);
        System.out.println("ACCOUNT Balance="+AccBalance);
    }
    public void withdraw(double amount){
        AccBalance=AccBalance-amount;
        System.out.println("Your New ACCOUNT Balance="+AccBalance);

    }


}
