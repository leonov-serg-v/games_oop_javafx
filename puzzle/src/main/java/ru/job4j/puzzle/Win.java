package ru.job4j.puzzle;

public class Win {
    private static boolean checkRow(int[][] board, int row) {
        for (int i : board[row]) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(int[][] board, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkRow(board, i) || checkCol(board, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
