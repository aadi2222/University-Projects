package com.adi;

public class ConstructorFailure {
    private int a;
    private int b;
    ConstructorFailure(int a,int b){
        this.a=a;
        this.b=b;
        a=a+b/0;
    }
}
