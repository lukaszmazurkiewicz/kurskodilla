package com.kodilla.sudoku;

public class SudokuChecks {

    public static void isInRow(SudokuBoard sudokuBoard, int numberOfRow) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getValue() == SudokuElement.EMPTY) {
                for (SudokuElement sudokuElement : sudokuBoard.getSudokuBoard().get(numberOfRow).getRow()) {

                    sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getElements().remove(sudokuElement.getValue());

                }
            }
        }
    }

    public static void isInColumn(SudokuBoard sudokuBoard, int numberOfColumn) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getRow().get(numberOfColumn).getValue() == SudokuElement.EMPTY) {
                for (int j = 0; j < SudokuBoard.NUMBER_OF_ROWS; j++) {
                    sudokuBoard.getSudokuBoard().get(i).getRow().get(numberOfColumn).getElements()
                            .remove(sudokuBoard.getSudokuBoard().get(j).getRow().get(numberOfColumn).getValue());
                }
            }
        }
    }

    public static void isInSquare(SudokuBoard sudokuBoard, int numberOfRow, int numberOfColumn) {
        int firstElementInRowInSection = numberOfRow - numberOfRow % 3;
        int firstElementInColumnInSection = numberOfColumn - numberOfColumn % 3;

        for (int i = firstElementInRowInSection; i < firstElementInRowInSection + 3; i++) {

            for (int j = firstElementInColumnInSection; j < firstElementInColumnInSection + 3; j++) {

                if (sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {

                    for(int k = firstElementInRowInSection; k < firstElementInRowInSection + 3; k++) {

                        for(int l = firstElementInColumnInSection; l < firstElementInColumnInSection + 3; l++) {

                            sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getElements().
                                    remove(sudokuBoard.getSudokuBoard().get(k).getRow().get(l).getValue());
                        }
                    }
                }
            }

        }
    }

    public static void isOk(SudokuBoard board, int numberOfRow, int numberOfColumn) {

        isInRow(board, numberOfRow);
        isInColumn(board, numberOfColumn);
        isInSquare(board, numberOfRow, numberOfColumn);

    }


}
