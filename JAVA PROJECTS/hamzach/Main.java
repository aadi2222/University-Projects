package com.hamzach;

import java.util.ArrayList;

public class Main {

    public static void printStats(Stats i) {
        i.computeArea();
        i.reset();
    }

    public static void main(String[] args) {
        ArrayList <Stats> objs = new ArrayList<>();

        objs.add(new Rectangle(10, 20));
        objs.add(new Country("friday", new int[] {1,2,3}, new int[] {4,5,6}));

        for (Stats obj: objs) {
            printStats(obj);
        }

    }
}
