package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Account acc=new Account();
	acc.getBal();
	acc.setTitle("Abdullah");
	acc.setBalance(1000);
	acc.displayAcc();
	System.out.println("Enter amount to deposit=");
	acc.balDeposit(input.nextDouble());
		acc.displayAcc();
        System.out.println("enter amount to withdraw:");
        acc.balWithdraw(input.nextDouble());
		acc.displayAcc();

    }
}
