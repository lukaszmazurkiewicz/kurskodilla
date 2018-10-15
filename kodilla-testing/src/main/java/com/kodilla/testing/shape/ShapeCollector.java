package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){

        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {

        shapes.remove(shape);
    }

    public void getFigure(int n) {

        shapes.get(n);
    }

    public void showFigures() {
        System.out.println("Zbiór figur w kolekcji to:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }
}
