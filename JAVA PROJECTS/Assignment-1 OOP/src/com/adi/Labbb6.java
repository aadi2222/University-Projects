/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labbb.pkg6;

/**
 *
 * @author admin
 */
public class Labbb6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time t1=new Time();
        Time t2=new Time(13);
        Time t3=new Time(13,58);
        Time t4=new Time(10,58,59);
        System.out.println("LOCAL TIME:");
        t4.displayTimeLocal();
        System.out.println("SECOND INCREMENT:");
        t4.Tick();
        t4.displayTimeLocal();
        System.out.println("MINUTE INCREMENT:");
        t4.incrementMin();
        t4.displayTimeLocal();
        System.out.println("HOUR INCREMENT:");
        t4.incrementHour();
        t4.displayTimeLocal();
        Time t5=new Time(t2);
        t5.displayTimeLocal();
        System.out.println("UNIVERSAL TIME:");
        t2.displayTimeUniversal();
        
    }
    
}
