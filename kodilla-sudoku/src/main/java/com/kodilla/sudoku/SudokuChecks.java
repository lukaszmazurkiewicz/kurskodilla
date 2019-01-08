package com.kodilla.sudoku;

public class SudokuChecks {

    public static void isInRow(SudokuBoard sudokuBoard, int numberOfRow) {
        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            if (sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getValue() == SudokuElement.EMPTY) {
                for (SudokuElement sudokuElement : sudokuBoard.getSudokuBoard().get(numberOfRow).getRow()) {
                    try {
                        /*int valueToDelete = sudokuElement.getValue();
                        System.out.println(valueToDelete);
                        int indexToDelete = sudokuElement.getElements().indexOf(valueToDelete);
                        System.out.println(indexToDelete);
                        if (valueToDelete >= 1) {*/
                            sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getElements().remove(sudokuElement.getValue());
                        //}
                        //sudokuBoard.getSudokuBoard().get(numberOfRow).getRow().get(i).getElements().remove(indexToDelete);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    //System.out.println(sudokuElement.getValue());
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
                    //System.out.println(sudokuBoard.getSudokuBoard().get(j).getRow().get(numberOfColumn).getValue());
                }
            }
        }
    }

    public static void isInSquare(SudokuBoard sudokuBoard, int numberOfRow, int numberOfColumn) {
        int r = numberOfRow - numberOfRow % 3;
        int c = numberOfColumn - numberOfColumn % 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {
                    for(int k = r; k < r + 3; k++) {
                        for(int l = c; l < c + 3; l++) {
                            sudokuBoard.getSudokuBoard().get(i).getRow().get(j).getElements().
                                    remove(sudokuBoard.getSudokuBoard().get(k).getRow().get(l).getValue());
                            //System.out.println(sudokuBoard.getSudokuBoard().get(k).getRow().get(l).getValue());
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
