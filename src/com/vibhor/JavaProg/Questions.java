package com.vibhor.JavaProg;

import java.util.*;


public class Questions {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        for(List<Integer> ans: subSet(nums)) {
            System.out.print(ans + "    ");
        }
    }

    int binarySearch(int[] arr) {
        PriorityQueue<Integer> maxHead = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHead = new PriorityQueue<>();

        return 1;
    }

    static List<List<Integer>> subSet(int[] nums) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
