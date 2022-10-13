package com.adi;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // <<<<<<<<<<< 11.20 >>>>>>>>>>>
        ReThrowing Rt=new ReThrowing();
        try{
            Rt.SomeMethod();
            throw new Exception();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Catched");
    }
       /* //<<<<<<<<< 11.19 >>>>>>
        try{
            ConstructorFailure cf=new ConstructorFailure(10,8);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Constructor Failure Handled");*/

   /* //<<<<<<<<<<<<<<<<< 11.17 >>>>>>>>>>>>>>>>>
    int a=16;
    String msg=null;
    try{
        if (a<18) {
            throw new ExceptionA("not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
    catch (ExceptionA e){
        e.printStackTrace();
    }
        System.out.println("EXCEPTIONA HANDLED");

        try{
            if (a<18) {
                throw new ExceptionB("eligible");
            }
            else{
                System.out.println("not Eligible");
            }
        }
        catch (ExceptionB e){
            e.printStackTrace();
        }
        System.out.println("EXCEPTIONB HANDLED");
        try{
            if (msg == null) {
                throw new NullPointerException();
            }
            else{
                System.out.println(msg);
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("NULLPOINTER EXCEPTION HANDLED");

        try{
            FileInputStream fil=new FileInputStream("abc.txt");
        }
        catch (IOException e){
            e.printStackTrace();

        }
        System.out.println("IO EXCEPTION HANDLED");
    }*/
}
