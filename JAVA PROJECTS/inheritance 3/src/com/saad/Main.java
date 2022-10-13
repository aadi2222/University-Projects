package com.saad;
// Saad Mukhtar
//sp20-bcs-124

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee>list=new ArrayList<>();

        list.add(new HourlyEmployee("usman",654674,45,new Date(3,4,2000)));
        list.add(new PermanentEmployee("Aali",5654,70,new Date(21,3,1999)));
        list.add(new PieceWorker(544));
        list.add(new BasePlusCommissionEmployee(800));
        list.add(new ComissionEmployee(900));

        final int month=2;
        for (Employee employee:list){

            System.out.println(employee);
            if((employee.getBirthdate().getMon()==month) || (employee instanceof BasePlusCommissionEmployee)){
                System.out.println("After Bonus Salary:"+(employee.earnings()+100));
            }
        }
    }
}
