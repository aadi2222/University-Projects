package com.adi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Employee emp1=new Employee("Abdullah",20000);
    Employee emp2=new Employee("Abdullah");
        System.out.println("Enter Salaray for Employee 2");
    emp2.setSalary(input.nextDouble());
        System.out.println("Annual Tax for Employee 1:");
    emp1.display();
    emp2.display();
    }
}
