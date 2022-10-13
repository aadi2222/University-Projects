package com.saad;
// Saad Mukhtar
//sp20-bcs-124
public class Date {
    private int day;
    private int mon;
    private int yr;

    public Date(int day,int mon,int yr){
        this.day=day;
        this.mon=mon;
        this.yr=yr;
    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYr() {
        return yr;
    }

    public String toString(){
        return "Date:"+day+"-"+mon+"-"+yr;
    }
}
