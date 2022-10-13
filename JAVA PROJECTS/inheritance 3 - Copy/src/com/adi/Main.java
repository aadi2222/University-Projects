package com.adi;

public class Main {

    public static void main(String[] args) {
	HourlyEmployee c1=new HourlyEmployee("AADI",123,10);
	PermanentEmployee c2=new PermanentEmployee("xyz",323,20);
    Employee c3=new Employee("bcd",444,0);
       System.out.println("Hourly Employee\n"+c1+"\nPermanent Emp\n"+c2+"\n"+c3);
    }
}
