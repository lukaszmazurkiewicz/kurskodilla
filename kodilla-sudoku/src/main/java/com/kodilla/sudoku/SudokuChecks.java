package com.kodilla.sudoku;

public class SudokuChecks {
    private SudokuBoard sudokuBoard;

    public SudokuBoard getSudoku() {
        return sudokuBoard;
    }

    public void isInRow(int numberOfRow) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getValue() == SudokuElement.EMPTY) {
                for (SudokuElement sudokuElement : sudokuBoard.getSudokuBoard().get(numberOfRow).getRow()) {
                    sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getElements().remove(sudokuElement.getValue());
                }
            }
        }
    }

    public void isInColumn(int numberOfColumn) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getRow().get(numberOfColumn).getValue() == SudokuElement.EMPTY) {
                for (int j = 0; j < SudokuBoard.NUMBER_OF_ROWS; j++) {
                    sudokuBoard.getSudokuBoard().get(i).getRow().get(numberOfColumn).getElements()
                            .remove(sudokuBoard.getSudokuBoard().get(j).getRow().get(numberOfColumn).getValue());
                }
            }
        }
    }

    public void isInSquare(int numberOfRow, int numberOfColumn) {
        int r = numberOfRow - numberOfRow % 3;
        int c = numberOfColumn - numberOfColumn % 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {
                    sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getElements().remove(sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getValue());
                }
            }

        }
    }

    public void isOk(int numberOfRow, int numberOfColumn) {

        isInRow(numberOfRow);
        isInColumn(numberOfColumn);
        isInSquare(numberOfRow, numberOfColumn);

    }
}
