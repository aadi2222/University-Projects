package com.adi;

public class date {
 private int year;
    private int month;
    private int day;
    public date(){
        year=21;
        month=03;
        day=06;
    }
    public date(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public void setDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public void display(){
        System.out.println(day+"/"+month+"/"+year);
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return (month);
    }
}
