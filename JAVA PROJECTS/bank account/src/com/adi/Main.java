package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    account acc=new account();
    Scanner input=new Scanner(System.in);
    acc.setAccId(123);
    acc.setAccName("Abdullah");
    acc.setAccType("Current");
    acc.setAccBalance(100000);
    acc.display();
        System.out.println("Enter Amount to deposit=");
    acc.deposit(input.nextDouble());
        System.out.println("Enter Amount to deposit=");
    acc.withdraw(input.nextDouble());
    }
}
