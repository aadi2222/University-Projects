package com.adi;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        //Constructors
        time t1=new  time();
        time t2=new  time(23);
        time t3=new  time(23,58);
        time t4=new  time(53,50,59);
        time t5=new  time(t4);


        //Methods
        System.out.println();
        System.out.println("T4 TIME :");
        System.out.println("Universal Time:");
        t4.displayTimeUniversal();
        System.out.println("Local Time:");
        t4.displayTimeLocal();
        System.out.println("Clone time 5 with t4");
        t5.displayTimeLocal();
        System.out.println("SECOND INCREMENT:");
        t4.Tick();
        t4.displayTimeLocal();
        System.out.println("MINUTE INCREMENT:");
        t4.incrementMin();
        t4.displayTimeLocal();
        System.out.println("HOUR INCREMENT:");
        t4.incrementHour();
        t4.displayTimeLocal();
        System.out.println("COUNT="+t4.getCount());

    }
}
