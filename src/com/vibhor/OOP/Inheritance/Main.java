package com.vibhor.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj = new Box(5, 6, 7);

        BoxWeight objW = new BoxWeight(3, 5, 2, 2);
//        System.out.println(objW.length);
    }

    double sum(double a, int b) {
        return a+b;
    }

    double sum(int a, double b) {
        return a+b;
    }
}
