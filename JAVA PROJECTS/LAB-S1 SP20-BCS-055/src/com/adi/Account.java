package com.adi;

public class Account {
    //SP20-BCS-055
    //ABDULLAH AHMAD
    //INSTANCE VARIABLES
    private String name;
    private double balance;
    static double yearlyInterestRate;
    static{
        yearlyInterestRate=0.05;
    }
    public Account(){
        this("MyAcoount",5000.0);
    }
    public Account(String name, double balance){
    this.name=name;
    if(balance>0){
        this.balance=balance;
    }else{
        System.out.println("ERROR!! WRONG INPUT!!");
        System.out.println("Program Exiting!!");
    }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getName(){
        return name;
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount<=balance){
            balance=balance-withdrawAmount;
        }else{
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    public void deposit(double depositAmount){
        balance=balance+depositAmount;
    }
    public double calculateMonthlyInterest(){
        double monthlyInterest=(balance*yearlyInterestRate)/12;
        balance=balance+monthlyInterest;
        return monthlyInterest;
    }
    static void modifyYearyInterestRate(double yearlyIInterestRate){
        yearlyInterestRate=yearlyIInterestRate;
    }

}
