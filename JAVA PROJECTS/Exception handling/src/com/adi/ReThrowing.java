package com.adi;

public class ReThrowing {
    private int a;
    private int b;
    ReThrowing(){
        int a=2;
        int b=5;
    }
    public void SomeMethod(){
        SomeMethod2();
        /*try{
            SomeMethod2();
            throw new Exception();
        }
        catch (Exception e){
            e.printStackTrace();
        }*/
        System.out.println("THROWING TO MAIN");

    }
    public void SomeMethod2(){
        System.out.println((a+b)/0);
       /*try{
           System.out.println((a+b)/0);
           throw new Exception();
       }
       catch (Exception e){
            e.printStackTrace();
       }*/
        System.out.println("THROWING TO METHOD 1");

    }


}
