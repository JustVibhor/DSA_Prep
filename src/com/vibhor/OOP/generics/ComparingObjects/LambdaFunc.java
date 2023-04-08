package com.vibhor.OOP.generics.ComparingObjects;

import java.util.ArrayList;

public class LambdaFunc {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            arr.add(i+4); 


        arr.forEach((i) -> System.out.println(i*4));

        Operation sum = Integer::sum;
        Operation prod = (a, b) -> a*b;
        Operation sub = (a, b) -> a - b;

        LambdaFunc fun = new LambdaFunc();

        System.out.println(fun.operate(10, 4, prod));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }






}

interface Operation {
    public int operation(int a, int b);
}
