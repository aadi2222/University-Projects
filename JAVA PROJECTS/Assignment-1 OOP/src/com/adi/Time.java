package labbb.pkg6;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int count;
    
    public Time(){
        hours=0;
        minutes=0;
        seconds=0;
    }
    public Time(int hour){
        hours=hour;
        minutes=20;
        seconds=21;
    }
    public Time(int hour,int min){
        hours=hour;
        minutes=min;
        seconds=21;
    }
    public Time(int hour,int min,int sec){
        hours=hour;
        minutes=min;
        seconds=sec;
    }
    public Time(Time t){
        this.hours=t.hours;
        this.minutes=t.minutes;
        this.seconds=t.seconds;
    }
    public void setTime(int hour,int min,int sec){
        hours=hour;
        seconds=sec;
        minutes=min;
        if (hour>23){
        hours=0;
        }
        if (min>60){
            minutes=0;
        }
        if (sec>60){
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
        if (hours>24){
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
