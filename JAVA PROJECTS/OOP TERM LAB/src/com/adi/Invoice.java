package com.adi;

import java.util.ArrayList;

public class Invoice {
    ArrayList<InvoiceItem> itemsAL;
    public Invoice(ArrayList<InvoiceItem>itemsAL){
        this.itemsAL=itemsAL;
    }
    public Invoice(){
        this.itemsAL=new ArrayList<>();
    }
    public void addItem(InvoiceItem i){
        itemsAL.add(i);
    }
    public void show(){
        for(InvoiceItem IT:itemsAL){
            System.out.println(IT);
        }
    }
}
