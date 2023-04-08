package com.vibhor.JavaProg;

public class fibonacciNum {

    public static void main(String[] args) {

//        System.out.println(fibonaci(6));
        System.out.println(fibOneLine(3));

//        int[] arr = {1, 2, 3, 4, 5};
//        int target = 3;
//
//        System.out.println(binSeaRecursion(arr, target, 0, arr.length-1));
    }

    public static int fibonaci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }

    public static int binSeaRecursion(int[] arr, int target, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid]>target) {
            return binSeaRecursion(arr, target, start, mid - 1);
        }
        return binSeaRecursion(arr, target, mid+1, end);
    }

    public static long fibOneLine(int n) {


        return (long) ((1/Math.sqrt(5))*Math.pow((1 + Math.sqrt(5)) / 2, n) - (1/Math.sqrt(5))*Math.pow((1 - Math.sqrt(5)) / 2, n));
    }
}
