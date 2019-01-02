package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    public static final int ELEMENTS_IN_ROW = 9;

    private List<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        IntStream.range(0, ELEMENTS_IN_ROW).forEach(i -> row.add(new SudokuElement()));
    }

    public List<SudokuElement> getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "| " + row.get(0).toString() +
                " | " + row.get(1).toString() +
                " | " + row.get(2).toString() +
                " || " + row.get(3).toString() +
                " | " + row.get(4).toString() +
                " | " + row.get(5).toString() +
                " || " + row.get(6).toString() +
                " | " + row.get(7).toString() +
                " | " + row.get(8).toString() + " |";
    }
}
