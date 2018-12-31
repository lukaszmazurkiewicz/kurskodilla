package com.kodilla.sudoku;

public class SudokuChecks {
    private SudokuBoard sudokuBoard;

    public void isInRow(int numberOfRow) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getValue() == SudokuElement.EMPTY) {
                for (SudokuElement sudokuElement : sudokuBoard.getSudokuBoard().get(numberOfRow).getRow()) {
                    sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getElements().remove(sudokuElement.getValue());
                }
            }
        }
    }
}
