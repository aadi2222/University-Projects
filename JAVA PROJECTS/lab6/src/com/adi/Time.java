package com.adi;

public class Time {
    private int sec;
    private int minutes, hours;
    static int count;


    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Time(){
        sec = 34;
        minutes = 30;
        hours = 12;
        count++;

    }
    public Time(int hr){
        hours = hr;
        minutes = 25;
        sec = 40;
        count++;

    }
    public Time (int hr, int mint){
        hours = hr;
        minutes = mint;
        sec = 20;
        count++;
    }
    public Time (int hr, int mint, int scs){
        hours = hr;
        minutes = mint;
        sec = scs;
        count++;
    }
    public Time(Time t){

    }
    public void setTime(int hr, int mint, int scs){
        minutes = mint;
        hours = hr;
        sec = scs;
    }
    public void displayTimeLocal(){
           if (hours>=12){
                if (hours>12){
                    hours = hours-12;
                }
                System.out.println(hours + ":" + minutes + ":" +sec + " PM");
            }

        else {
            System.out.println(hours + ":" + minutes + ":" + " AM");
        }

    }
    public void TimeUniversal(){

            System.out.println(hours + ":" + minutes + ":" + sec);

    }
    public void tick(){
        ++sec;
    }
    public void Incrmint(){
        ++minutes;
    }
    public void Incrhour(){
        ++hours;
    }
}
