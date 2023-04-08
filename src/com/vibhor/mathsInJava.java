package com.vibhor;

public class mathsInJava {

    public static void main(String[] args) {
//        System.out.println(powerOfTwo(8));
        System.out.println(Integer.toBinaryString(197));
        System.out.println(findSetBits(197));
    }

    public static int binary(int[] arr) {
        int ones=0;
        int twos=0;
        for(int i: arr) {
            ones=(ones^i)&(~twos);
            System.out.println(ones);
            System.out.println("ONES========================ONES");
            twos=(twos^i)&(~ones);
            System.out.println(twos);
            System.out.println("TWOs========================TWOS");
            System.out.println();
        }
        return ones;
    }

    public static int magicNumber(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n&1;
            n >>= 1;
            ans += last*base;
            base *= 5;
        }

        return ans;
    }

    public static int countNoOfDigits(int n, int b) {
        return (int)(Math.log(n) / Math.log(b)) + 1;
    }

    public static void pascalTriangle(int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {

            }
        }
    }

    public static boolean powerOfTwo(int n) {
        return (n &(n-1)) == 0;
    }

    public static int calculatePower(int base, int power) {
        int ans = 1;

        while (power > 0) {
            if((power & 1) == 1) {    // if the last digit is 1 ans is calculated
                ans *= base;
            }

            base *= base;   // squares the base ex: 3*3 after every cycle
            power >>= 1;   // right shift if there's one
        }
        return ans;
    }

    public static int findSetBits(int n) {
        int count = 0;
//
//        while(n > 0) {
//            if((n&1) == 1) {
//                count++;
//            }
//
//            n >>= 1;
//        }
//        return count;

        // lets try something better


        while(n > 0) {
            count++;
            n = n - (n & (-n));   // n & -n gives right most set bit "1"  and deleting it one by one
        }
        return count;
    }

    public static int XorFrom0Ton(int n) {
        if(n%4 == 0) {                      // study the relation on notebook by Xoring 0 to n
            return n;
        } else if (n%4 == 1) {
            return 1;
        } else if (n%4 == 2) {
            return n+1;
            
        } else if (n%4 == 3) {
            return 0;
            
        }
        return -1;
    }

    public static int Xor_from_b_to_a(int a, int b){
        return XorFrom0Ton(b) ^ XorFrom0Ton(a - 1);
    }

    public static int[][] flipping_an_image(int[][] image) {

        for(int[] row: image) {
            for (int i = 0; i < image[0].length/2; i++) {    // don't need to loop through the whole row to swap
                int temp = row[i]^1;                        // using complement to invert 0 to 1, also would save the trouble of using another loop
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }




}
