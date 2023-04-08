package com.vibhor.JavaProg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        String fruit = sc.next();
//
////        if(fruit.equals("mango")) {
////            System.out.println("tasty!!");
////        }
//
//        switch (fruit) {
//            case "mango" -> System.out.println("tasty");
//            case "apple" -> System.out.println("crunch is my new munch");
//            case "pineapple" -> System.out.println("tasty but hurt my tongue");
//            default -> System.out.println("not a fruit mentioned");
//        }

//        switch (sc.nextInt()) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("not b/w 1 and 7");
//        }

        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Vibhor");
            case 2 -> System.out.println("Again Vibhor");
            case 3 -> {
                System.out.println("New Employee");
                switch (department) {
                    case "IT" -> System.out.println("IT dep.");
                    case "Marketing" -> System.out.println("M Dept");
                    default -> System.out.println("Jobless");
                }
            }
            default -> System.out.println("Yeh bhi nalla");
        }
        }


    }


