package com.vibhor.LinkedList.InternalWorking;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];


        System.out.println(queen(board, 0));

    }

    static List<List<String>> queen(boolean[][] board, int row) {
        if(row == board.length) {
            List<List<String>> list = new ArrayList<>();
            list = display(board);
            return list;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                queen(board, row+1);
                board[row][col] = false;
            }
        }
        return new ArrayList<>();


    }

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

    private static List<List<String>> display(boolean[][] board) {
        List<List<String>> final_list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(boolean[] row: board) {
            String str = "";
            for(boolean element: row) {
                if(element) {
                    str += "Q";
                }
                else {
                    str += ".";
                }
            }
            list.add(str);
        }
        final_list.add(list);
        return final_list;
    }
}
