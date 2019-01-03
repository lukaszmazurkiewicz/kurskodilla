package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuBoard {
    public static final int NUMBER_OF_ROWS = 9;

    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
        IntStream.range(0, NUMBER_OF_ROWS).forEach(i -> sudokuBoard.add(new SudokuRow()));
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    @Override
    public String toString() {
        return  "    1   2   3    4   5   6    7   8   9  "+ "\n" +
                "  ---------------------------------------" + "\n" +
                "1 " + sudokuBoard.get(0).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "2 " + sudokuBoard.get(1).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "3 " + sudokuBoard.get(2).toString() + "\n" +
                "  =======================================" + "\n" +
                "4 " + sudokuBoard.get(3).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "5 " + sudokuBoard.get(4).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "6 " + sudokuBoard.get(5).toString() + "\n" +
                "  =======================================" + "\n" +
                "7 " + sudokuBoard.get(6).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "8 " + sudokuBoard.get(7).toString() + "\n" +
                "  ---------------------------------------" + "\n" +
                "9 " + sudokuBoard.get(8).toString() + "\n" +
                "  ---------------------------------------" + "\n";
    }
}
