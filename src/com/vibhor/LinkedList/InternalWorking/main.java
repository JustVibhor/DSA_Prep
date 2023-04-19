package com.vibhor.LinkedList.InternalWorking;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];


        N_Knigts(board, 0, 0, n);

    }

//    static List<List<String>> queen(boolean[][] board, int row) {
//        if(row == board.length) {
//            List<List<String>> list = new ArrayList<>();
//            list = display(board);
//            return list;
//        }
//
//        int count = 0;
//
//        for (int col = 0; col < board.length; col++) {
//            if(isSafe(board, row, col)) {
//                board[row][col] = true;
//                queen(board, row+1);
//                board[row][col] = false;
//            }
//        }
//        return new ArrayList<>();
//
//
//    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // checking vertically up
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        int max_left = Math.min(row, col);
        for (int i = 1; i <= max_left; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        int max_right = Math.min(row, board.length-col-1);
        for (int i = 1; i <= max_right; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    private static void N_Knigts(boolean[][] board, int r, int c, int knights) {
        if(knights == 0) {
            display(board);
            System.out.println();
        }

        if(r == board.length-1 && c == board[0].length-1) {
            return;
        }

        if(c == board.length) {
            N_Knigts(board, r+1, 0, knights);
            return;
        }

        if(isSafeKnight(board, r, c)) {
            board[r][c] = true;
            N_Knigts(board, r, c+1, knights-1);
            board[r][c] = false;
        }

        N_Knigts(board, r, c+1, knights);
    }

    private static boolean isSafeKnight(boolean[][] board, int r, int c) {
        if(isValid(board, r-2, c-1)) {
            if(board[r-2][c-1]) {
                return false;
            }
        }

        if(isValid(board, r-2, c+1)) {
            if(board[r-2][c+1]) {
                return false;
            }
        }

        if(isValid(board, r-1, c-2)) {
            if(board[r-1][c-2]) {
                return false;
            }
        }

        if(isValid(board, r-1, c+2)) {
            return !board[r - 1][c + 2];
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c) {
        return r >= 0 && r < board.length && c >= 0 && c < board[0].length;
    }
}
