package com.kodilla.testing.shape;

public class Triangle implements Shape {

    int altitude;
    int side;

    public Triangle(int altitude, int side) {
        this.altitude = altitude;
        this.side = side;
    }

    public String getShapeName() {

        return "Triangle";

    }

    public double getField(){

        return (side * altitude) / 2;

    }
}
