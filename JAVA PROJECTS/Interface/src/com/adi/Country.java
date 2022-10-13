package com.adi;

import java.util.ArrayList;

public class Country implements Stats {
    private String name;
    private int[] provincesAreas=new int[3];
    ArrayList<Integer> statesAreas=new ArrayList<>();

    public Country(){
        provincesAreas[0]=3000;
        provincesAreas[1]=5000;
        provincesAreas[2]=6000;

        statesAreas.add(1000);
        statesAreas.add(2000);
        statesAreas.add(3000);
    }

    @Override
    public void computeArea() {
      double area=0;
       for(int proArea: provincesAreas){
           area+=proArea;
       }
       for(int statArea: statesAreas){
           area+=statArea;
       }
        System.out.println("Total Area=" + area);
       return;
    }

    @Override
    public void reset() {
        for(int proArea: provincesAreas){
            proArea=0;
        }
        for(int statArea: statesAreas){
            statArea=0;
        }
        System.out.println("Values Reset to 0");
        return;
    }


}
