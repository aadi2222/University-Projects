package com.adi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        circle crcl = new circle();
        crcl.setRadius(45);
        System.out.println("radius:" + crcl.getRadius());
        System.out.println(crcl.perimeter());
        System.out.println(crcl.area());
    }
}
