package com.adi;

public class Main {

    public static void main(String[] args) {
	    //SP20-BCS-055
        //ABDULLAH AHMAD
        Account acc1=new Account();
        Account acc2=new Account("Hello",10000.0);
        acc1.calculateMonthlyInterest();
        acc2.calculateMonthlyInterest();
        System.out.println("NAME:"+acc1.getName()+"Balance:"+acc1.getBalance());
        System.out.println("NAME:"+acc2.getName()+"Balance:"+acc2.getBalance());
        acc1.deposit(1000);
        acc2.deposit(10000);
        Account.modifyYearyInterestRate(0.1);
        acc1.calculateMonthlyInterest();
        acc2.calculateMonthlyInterest();
        System.out.println("NAME:"+acc1.getName()+"Balance:"+acc1.getBalance());
        System.out.println("NAME:"+acc2.getName()+"Balance:"+acc2.getBalance());
    }
}
