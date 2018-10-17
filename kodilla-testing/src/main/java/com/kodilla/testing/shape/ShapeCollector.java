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

    public Shape getFigure(int n) {

        return shapes.get(n);
    }

    public void showFigures() {
        System.out.println("Zbiór figur w kolekcji to:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("- " + shapes.get(i).getShapeName());
        }
    }

    public int getSize() {

        return shapes.size();
    }

    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(1));
        shapeCollector.addFigure(new Triangle(1,1));
        shapeCollector.addFigure(new Circle(1));

        shapeCollector.showFigures();
    }
}
