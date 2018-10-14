package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<>();

    public void exterminate(ArrayList<Integer> numbers) {

        for (int n = 0; n < numbers.size(); n++) {
            if ( numbers.get(n) % 2 == 0) {
                evenNumbers.add(n);
            }
        }
    }

    public int getSize() {
        return evenNumbers.size();
    }
}
