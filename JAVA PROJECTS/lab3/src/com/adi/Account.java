package com.adi;

public class Account {
    private String title;
    private double balance;

    public void setTitle(String title){
        this.title=title;
    }
    public void setBalance(double bal){
        balance=bal;
    }
    public String getTitle() {
        return (title) ;
    }
    public double getBal() {

        return (balance);
    }
    public void displayAcc(){
        System.out.println("Account title="+title+"\n" +"Account Balance="+balance);

    }
    public void balDeposit(double bal){
        balance=balance+bal;
    }
    public void balWithdraw(double bal){
        balance=balance-bal;
    }
}
