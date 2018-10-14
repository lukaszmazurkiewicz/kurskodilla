package com.kodilla.testing.shape;

public class Square implements Shape {

    public void getShapeName() {
        System.out.println("This is Square.");
    }

    public void getField(double field){
        System.out.println("Field of the figure: " + field);
    }
}
