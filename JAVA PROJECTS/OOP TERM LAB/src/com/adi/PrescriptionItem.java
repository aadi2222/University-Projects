package com.adi;

public class PrescriptionItem extends Item{
    private int potency;
    private int dose;
    private int currentStatus;

    public PrescriptionItem(int id,String name,int potency,int dose){
        super(id, name);
        this.dose=dose;
        this.potency=potency;
        currentStatus=1;
    }

    public void changeState(){
     if(currentStatus==1){
         currentStatus=2;
     }else if(currentStatus==2){
         currentStatus=3;
     }else if(currentStatus==3){
         currentStatus=1;
        }
    }

    public void reset(){
        currentStatus=1;
    }
}
