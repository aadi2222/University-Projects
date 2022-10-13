package com.adi;

public class time {

    private int hours;
    private int minutes;
    private int seconds;
    static int count;

    static {
        count=0;

    }


    //CONSTRUCTORS
    public time(){
        hours=0;
        minutes=0;
        seconds=0;
        count++;
        setTime(hours,minutes,seconds);
    }
    public time(int hour){
        hours=hour;
        minutes=0;
        seconds=0;
        count++;
        setTime(hours,minutes,seconds);

    }
    public time(int hour,int min){
        hours=hour;
        minutes=min;
        seconds=0;
        count++;
        setTime(hours,minutes,seconds);
    }
    public time(int hour,int min,int sec){
        hours=hour;
        minutes=min;
        seconds=sec;
        count++;
        setTime(hours,minutes,seconds);
    }
    public time(time t){
        this.hours=t.hours;
        this.minutes=t.minutes;
        this.seconds=t.seconds;
        count++;
    }





    //set/get methods
    public void setHours(int hours){
        this.hours=hours;
    }
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }


    //METHODS
    public void setTime(int hour,int min,int sec){
        hours=hour;
        seconds=sec;
        minutes=min;
        if (hour>=24){
            hours=0;
        }
        if (min>=60){
            minutes=0;
        }
        if (sec>=60){
            seconds=0;
        }


    }
    public void displayTimeLocal(){
        if(hours<12){
            System.out.printf("%d:%d:%d AM\n",hours,minutes,seconds);
        }else{
            System.out.printf("%d:%d:%d PM\n",(hours-12),minutes,seconds);
        }
    }
    public void displayTimeUniversal(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    public void Tick(){
        seconds++;
        if(seconds>=60){
            seconds=seconds-60;
            minutes++;
        }
        if(minutes>=60){
            minutes=minutes-60;
            hours++;
        }
        if (hours>=24){
            hours=hours-24;
        }
    }
    public void incrementMin(){
        minutes++;
        if(minutes>=60){
            minutes=minutes-60;
            hours++;
        }
        if (hours>=24){
            hours=hours-24;
        }
    }
    public void incrementHour(){
        hours++;
        if (hours>23){
            hours=hours-24;
        }
    }
}
