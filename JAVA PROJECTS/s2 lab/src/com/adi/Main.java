package com.adi;
import java.util.ArrayList;
public class Main {
//SP20-BCS-055
    public static void main(String[] args) {

        ArrayList<GeometricObject> geoObjs = new ArrayList<>();
        Circle[] circles = new Circle[3];
        ResizableCircle[] resizableCircles = new ResizableCircle[2];

        geoObjs.add(new Circle(30));
        geoObjs.add(new Circle(60));
        geoObjs.add(new Circle(3));
        geoObjs.add(new ResizableCircle(70));
        geoObjs.add(new ResizableCircle(40));

        for (GeometricObject geoObj: geoObjs) {

            System.out.println("Area=" + geoObj.getArea());

            System.out.println("Perimeter=" + geoObj.getPerimeter());
        }


        int a=0;
        int b=0;
        for (int i=0; i<5; i++) {
            if(geoObjs.get(i) instanceof ResizableCircle) {
                resizableCircles[a] = (ResizableCircle) geoObjs.get(i);
                a++;
            } else {

                circles[b] = (Circle) geoObjs.get(i);
                b++;
            }
        }
    }
}
