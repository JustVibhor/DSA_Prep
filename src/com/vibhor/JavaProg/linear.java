package com.vibhor.JavaProg;

import java.util.Arrays;

public class linear {
    public static void main(String[] args) {
//        int[] nums = {100, 200, 41, 39, 32, 21, 5, 4444, 545454};
//
//        System.out.println(isEvenDigits(nums));
//        int target = 219;
//        int ans = linearSearch(nums, 0, nums.length-1);
//        if(ans != -1) System.out.println("Min: " + ans);
//        else System.out.println("Min: " + ans);

//        String str = "That doesn't sound like that";
//        char target = 'z';
//        boolean ans = search(str, target);
//        System.out.println(ans);

//        2D Array Search
        int[][] nums = {
                {1, 4, 5},
                {7, 20, 10}
        };
        System.out.println(maxWealth(nums));
//
//        int target = 55;
//        int ans = max2Darray(nums);
//        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int initial, int fin) {
        if(arr.length == 0) {
            return -1;
        }

        int min = arr[0];
//        run a for loop
        for (int index = initial; index <= fin; index++) {

            //check for element at every index if its equal to target

            if(min > arr[index]) {
                min = arr[index];

            }
            
        }

        return min;
    }

    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
    
    static boolean search2(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for (char ch: str.toCharArray()) {
            if(target == ch) {
                return true;
            }
        }
        return false;
    }

    static int[] search2Darray(int[][] arr, int target) {
//        if(arr.length == 0) {
//            return -1;
//        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }

            }
//            return -1;

        }
        return new int[]{-1, -1};
    }

    static int max2Darray(int[][] arr) {
//        if(arr.length == 0) {
//            return -1;
//        }
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }

            }
//            return -1;

        }
        return max;
    }

    static int isEvenDigits(int[] arr) {
        int count = 0;
        for (int i : arr) {
            int digit = 0;
            int numb = i;

            while (numb > 0) {
                numb = numb / 10;
                digit++;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;


    }

    static int maxWealth(int[][] arr) {
        int max = 0;
        for (int person = 0; person < arr.length; person++) {
            int perSum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                perSum += arr[person][account];
            }
            if(max<perSum) {
                max = perSum;
            }

        }
        return max;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }

}

