package com.kodilla.sudoku;

public class SudokuGameplay {

    private SudokuChecks sudokuChecks;

    public void resolveSudoku() {

        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            for (int j = 0; j < SudokuBoard.NUMBER_OF_ROWS; j++) {
                if (sudokuChecks.getSudoku().getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {
                    sudokuChecks.isOk(i,j);
                    sudokuChecks.getSudoku().getSudokuBoard().get(i).getRow().get(j)
                            .setValue(sudokuChecks.getSudoku().getSudokuBoard().get(i).getRow().get(j).getElements().get(0));
                }
            }
        }

    }
}
