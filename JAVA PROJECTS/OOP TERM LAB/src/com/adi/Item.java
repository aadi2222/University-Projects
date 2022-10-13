package com.adi;

public abstract class Item implements StateManager{
    private int id;
    private String name;

    public Item(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return String.format("Item Name: <<%s>> (<<%d>>)",name,id);
    }

}
