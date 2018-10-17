package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(int radius) {

        this.radius = radius;

    }

    public String getShapeName() {

        return "Circle";

    }

    public double getField(){

        return Math.PI * Math.pow(radius,2);

    }
}
