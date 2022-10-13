package com.adi;

public class InvoiceItem extends Item{
private float price;
private int quantity;
private float discount;
private boolean Availability;

public InvoiceItem(int id,String name,float price,int quantity){
    super(id,name);
    this.price=price;
    this.quantity=quantity;
    Availability=true;
    discount= 10.0F;
}
public void changeState(){
    if (Availability==true){
        Availability=false;
    }else{
        Availability=true;
    }
}
public void reset(){
    Availability=true;
}
public float computePrice(){
    return (float) (price*quantity*0.1);
}
public String toString(){
return String.format("%s\nPrice: %.2f\tQuantity:%d\tTotal:%.2f(@%.2f % discount)",super.toString(),price,quantity,computePrice(),discount);
}
}
