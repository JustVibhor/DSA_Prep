package com.vibhor.JavaProg;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class stringsMethod {
    public static void main(String[] args) {
        pattern31(4);

    }

    public static boolean strpal(String name) {
        if(name == null) {
            return false;
        }
        int i = 0;
        int j = name.length()-1;
        while(i<name.length() && j>0) {

            if(name.charAt(i) == name.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void pattern1(int n) {
        for (int row = 0; row < 2*n; row++) {
            if(row<n+1) {
                for (int col = 0; col < row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int col = n-1; col > row-n-1; col--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void pattern2(int n ){

        for (int row = 0; row < 2*n; row++) {
            int cols = row > n ? 2*n - row : row;

            for (int col = 0; col < cols; col++) {
                System.out.print(" * ");
                
            }
            System.out.println();
            System.out.println();
        }

    }

    public static void pattern3(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void pattern28(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalCols = row > n ? 2*n-row : row;

            int numberOfSpaces = n- totalCols;
            for (int space = 0; space < numberOfSpaces; space++) {
                System.out.print("  ");
            }

            for (int col = totalCols; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();


        }
    }

    public static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfSpaces = n - row;

            for (int space = 0; space < numberOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        for (int row = 0; row <= 2*n; row++) {
            for (int col = 0; col <= 2*n; col++) {
                int minus = Math.min(Math.min(row, col), Math.min(2*n - row, 2*n - col));
                System.out.print(n -minus + " ");
            }
            System.out.println();
        }
    }
}
