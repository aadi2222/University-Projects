package com.hamzach;

import java.util.Arrays;

public class Country implements Stats {
    private String name;
    private int[] provincesAreas;
    private int[] statesAreas;

    public Country(String name, int[] provincesAreas, int[] statesAreas) {
        this.name = name;
        this.provincesAreas = provincesAreas;
        this.statesAreas = statesAreas;
    }

    public void computeArea() {
        int area = 0;

        for(int provinceArea: provincesAreas) {
            area += provinceArea;
        }
        for (int statesArea: statesAreas) {
            area += statesArea;
        }
        System.out.println("Area of Country: " + area + " " + unitKm);
    }
    public void reset() {
        Arrays.fill(provincesAreas, 0);
        Arrays.fill(statesAreas, 0);
    }

    public void printArray() {
        System.out.println(Arrays.toString(provincesAreas));
        System.out.println(Arrays.toString(statesAreas));
    }
}
