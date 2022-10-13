package com.adi;
//SP20-BCS-055

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {

        double radius = super.getRadius();
        double newRadius = radius * ( (double) percent/100);
        super.setRadius(radius + newRadius);

    }
}
