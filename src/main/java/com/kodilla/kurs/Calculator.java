package com.kodilla.kurs;

public class Calculator {
    private int elementA = 0;
    private int elementB = 0;
    private int sum = 0;

    public int addAToB(int elementA,int elementB) {
        return elementA + elementB;
    }

    public int substractAFromB(int elementA,int elementB) {
        return elementB - elementA;
    }

    public String toString() {
        return "Suma to: " + sum;
    }
}
