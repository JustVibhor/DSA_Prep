package com.vibhor.OOP.DeleteIt;

import com.vibhor.OOP.AcessModifier.A;

public class B extends A {
    int alpha;
    public B(int num, int aplha) {

        super(num);
        this.alpha = aplha;
    }
    public static void main(String[] args) {
        B obj = new B(5, 55);
        int n =obj.num;
    }
}
