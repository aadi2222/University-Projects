package com.adi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee>EmployeeArray=new ArrayList<>();

        EmployeeArray.add(new PermanentEmployee("AADI",2123,55,new Date(12,12,2000)));
        EmployeeArray.add(new HourlyEmployee("ali",1223,40,new Date(11,8,1999)));
        EmployeeArray.add(new ComissionEmployee("hamza",2343,54,3.5,500,new Date(21,11,1999)));
        EmployeeArray.add(new BasePlusCommissionEmployee("huzaifa",89669,54,2.5,570,new Date(1,1,1999)));
        EmployeeArray.add(new PieceWorker("hamza",2343,54,new Date(21,8,1999),500,50));

        final int month=8;

        for (Employee employee:EmployeeArray){

            System.out.println(employee);

            if((employee.getBirthdate().getMon()==month) || (employee instanceof BasePlusCommissionEmployee)){
                System.out.println("YOU HAVE GOT 100$ AS BONUS\n NEW SALARY:$"+(employee.earnings()+100));

            }
        }
    }
}
