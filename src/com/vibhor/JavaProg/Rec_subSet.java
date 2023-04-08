package com.vibhor.JavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rec_subSet {

    public static void main(String[] args) {

//        ArrayList<String> list = subSetAscii("", "abc");

//        List<List<Integer>> list = subset_for_duplicate(new int[]{1, 2, 2});
//
//        for(List<Integer> l: list) {
//            System.out.println(l);
//        }

        List<String> ans = permutation("", "abc");
        System.out.println(ans);


    }
        public static String rec_remove_a(String up) {
            if(up.isEmpty()) {
                return "";
            }

            char ch = up.charAt(0);

            if(ch == 'a') {
                return rec_remove_a(up.substring(1));
            } else {
                return ch + rec_remove_a(up.substring(1));
            }
        }


        public static String skip_apple(String up) {

            if(up.isEmpty()) {
                return "";
            }

            char ch = up.charAt(0);

            if(up.startsWith("apple")) {
                return skip_apple(up.substring(5));
            } else if (up.startsWith("app")) {
                return skip_apple(up.substring(3));

            } else {
                return ch + skip_apple(up.substring(1));
            }
        }

        public static ArrayList<String> subSet(String p, String up) {
            if(up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            char ch = up.charAt(0);

            ArrayList<String> left = subSet(p+ch, up.substring(1));
            ArrayList<String> right = subSet(p, up.substring(1));
            left.addAll(right);
            return left;
        }

        public static ArrayList<String> subSetAscii(String p, String up) {
            if(up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            char ch = up.charAt(0);

            ArrayList<String> first = subSetAscii(p+ch, up.substring(1));
            ArrayList<String> second = subSetAscii(p, up.substring(1));
            ArrayList<String> third = subSetAscii(p + (ch + 0), up.substring(1));

            first.addAll(second);
            first.addAll(third);
            return first;
        }

        public static List<List<Integer>> subset_using_iteration(int[] arr) {
            List<List<Integer>> outer = new ArrayList<>();

            outer.add(new ArrayList<>());

            for(int num: arr) {
                int n = outer.size();
                for(int i=0; i<n; i++) {
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(num);
                    outer.add(internal);
                }

            }
            return outer;
        }

        static List<List<Integer>> subset_for_duplicate(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            int start = 0;
            int end = 0;

            for(int i=0; i<arr.length; i++) {
                start = 0;
                if(i>0 && arr[i] == arr[i-1]) {
                    start = end + 1;
                }
                end = outer.size() - 1;
                int n = outer.size();

                for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
            return outer;
        }

        static List<String> permutation(String p, String up) {
            if(up.isEmpty()) {
                List<String> lists = new ArrayList<>();
                lists.add(p);
                return lists;
            }

            char ch = up.charAt(0);
            List<String> ans = new ArrayList<>();
            for (int i = 0; i <= p.length(); i++) {
                String first = p.substring(0, i);
                String second  = p.substring(i, p.length());

                ans.addAll(permutation(first+ch+second, up.substring(1)));
            }

            return ans;
        }


        

}
