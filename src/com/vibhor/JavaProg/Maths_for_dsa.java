package com.vibhor.JavaProg;

import java.util.ArrayList;

public class Maths_for_dsa {

    public static void main(String[] args) {

//        for (int i = 1; i < 40; i++) {
//            if(prime(i)) {
//                System.out.println(i);
//            }
//        }
//        int n = 40;
//        boolean[] primes = new boolean[n+1];                    // n+1 is used as array starts from 0
//        sieve(n, primes);


        //sqrt algo
//        System.out.format("%.2f", NewtonSQRT(40));
        factor(36);
        
    }

    public static boolean prime(int n) {

        if(n<=1) {
            return false;
        }
        int c = 2;

        while (c*c <= n) {
            if(n%c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    //using sieve of eratosthenes

    public static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {                        // after sqrt(n) multiple will start repeating
            if(!primes[i]) {                                    // false is used as boolean default value is false
                for(int j = i*i; j<=n; j+=i) {                  // to eliminate multiple of i this loop is used
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static double square_root(int p, int n) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s<= e) {                         // normal binary search
            int mid = s + (e-s)/2;

            if(mid*mid == n) {
                return mid;
            }

            if(mid*mid < n) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
            root = mid;

        }

        double inc = 0.1;                       // decimal place to add in the root
        for (int i = 0; i < p; i++) {           // loop till precision
            while(root * root <= n) {           // keep adding inc until its equals to n
                root += inc;
            }
            root -= inc;                        // as an extra inc will be added
            inc /= 10;                          // add more decimal place
        }
        return root;
    }

    public static double NewtonSQRT(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }

    public static void factor(int n) {
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                if(n/i == i) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print(i + "  ");
                    lists.add(n/i);
                }
                
            }
        }

        for(int i = lists.size()-1; i >= 0; i--) {
            System.out.print(lists.get(i) + "  ");
        }
    }

    public static int roman_to_int(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == 'I') {
                sum++;
            } else if (a == 'V') {
                sum += 5;
            } else if (a == 'X') {
                sum += 10;
            } else if (a == 'L') {
                sum += 50;
            } else if (a == 'C') {
                sum += 100;
            } else if (a == 'D') {
                sum += 500;
            } else if (a == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }

}


 