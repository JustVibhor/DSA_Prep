package com.vibhor.JavaProg;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 0};

        // return search(arr, 2);
        System.out.println(search(arr, 3));

    }

    public static int search(int[] arr, int target) {
        int peak = peakElement(arr);

        int start = 0;

        int ans = binarySearch(arr, target, start, peak);

        if(ans != -1) {
            return ans;
        }

        start = peak + 1;
        int end = arr.length - 1;

        return binarySearch(arr, target, start, end);




    }

    public static int binarySearch(int[] arr, int target,int start, int end) {

        boolean isAscending = arr[start] < arr[end];
        while(start<=end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending) {
                if(target>arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

            else {
                if(target<arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end) {
            int mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return start;
    }
}
