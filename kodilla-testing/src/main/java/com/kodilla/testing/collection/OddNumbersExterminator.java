package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int n = 0; n < numbers.size(); n++) {
            if ( numbers.get(n) % 2 == 0) {
                evenNumbers.add(numbers.get(n));
            }
        }
        return evenNumbers;
    }
}