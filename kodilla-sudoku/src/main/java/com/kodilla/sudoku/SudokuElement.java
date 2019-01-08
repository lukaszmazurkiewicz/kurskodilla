package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuElement {
    public static final int EMPTY = -1;

    List<Integer> elements = new ArrayList<>();
    private Integer value;

    public SudokuElement() {
        this.value = EMPTY;
        IntStream.range(1,10).forEach(i -> elements.add(i));
    }

    public Integer getValue() {
        return value;
    }

    public List<Integer> getElements() {
        return elements;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == EMPTY) {
            return " ";
        }
        return value.toString();
    }
}
