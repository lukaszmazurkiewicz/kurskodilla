package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    public static final int EMPTY = -1;

    List<Integer> elements = Arrays.asList(1,2,3,4,5,6,7,8,9);
    private Integer value;

    public SudokuElement() {
        this.value = EMPTY;
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
