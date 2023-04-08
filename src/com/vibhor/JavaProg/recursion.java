package com.vibhor.JavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursion {
    public static void main(String[] args) {
//        funRev(5);
//        System.out.println(linear_search_recursion(new int[]{1,3, 4, 5}, 0, 3));
//        System.out.println(linear_search(new int[]{1,3, 3, 4, 5}, 0, 3));
//        pattern1_recursion(4, 0);
        int[] arr = {5, 4, 3, 2, 1};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void funRev(int n) {
        if(n == 0) {
            return;
        }

        funRev(n -1);
        System.out.println(n);
    }

    static boolean sorted_or_not(int[] arr, int index) {
        if(index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted_or_not(arr, index+1);

    }

    static ArrayList<Integer> linear_search_recursion(int[] arr, int index, int target, ArrayList<Integer> lists) {
        if(index == arr.length) {
            return lists;
        }

        if(arr[index] == target) {
            lists.add(index);
        }
        return linear_search_recursion(arr, index+1, target, lists);
    }

    // without using arraylist as argument

    static ArrayList<Integer> linear_search(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = linear_search(arr, index+1, target);

        list.addAll(ansFromBelowCalls);

        return list;
    }

    static void pattern1_recursion(int r, int c){
        if(r == 0) {
            return;
        }

        if(r > c) {
            pattern1_recursion(r, c + 1);
            System.out.print("*");
        } else {
            pattern1_recursion(r-1, 0);
            System.out.println();
        }
    }

    static void bub_sort_rec(int[] arr, int length, int c) {
        if(length == 0) {
            return;
        }

        if(length > c) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bub_sort_rec(arr, length, c+1);
        }
        else {
            bub_sort_rec(arr, length-1, 0);
        }
    }

    static void selec_sort_rec(int[] arr, int length, int c, int max) {
        if(length == 0) {
            return;
        }

        if(length > c) {

            if(arr[c] > arr[max]) {
                max = c;


            }
            selec_sort_rec(arr, length, c+1, max);

        } else {
            int temp = arr[max];
            arr[max] = arr[length];
            arr[length] = temp;

            selec_sort_rec(arr, length-1, 0, max);
        }

    }

    static int[] merge_sort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i=0, j=0, k=0;

        while(i<left.length && j<right.length) {
            if(left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j< right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    private static void merge_sort_Inplace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }

        int mid = (end + start) / 2;

        merge_sort_Inplace(arr, start, mid);
        merge_sort_Inplace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i<mid && j<end) {
            if(arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }

    static void quick_sort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low, end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];


        while(start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quick_sort(arr, low, end);
        quick_sort(arr, start, high);
    }


}
