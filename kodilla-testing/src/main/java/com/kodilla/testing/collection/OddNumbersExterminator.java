package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int n = 0; n < numbers.size(); n++) {
            if ( numbers.get(n) % 2 == 0) {
                evenNumbers.add(numbers.get(n));
            }
        }
    }
}