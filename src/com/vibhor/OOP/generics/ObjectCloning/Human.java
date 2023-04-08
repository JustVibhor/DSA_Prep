package com.vibhor.OOP.generics.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[]{1, 4, 6, 32};
    }

//    public Object clone() throws CloneNotSupportedException {
//        // this is shallow copy change in twin object will reflect to the original
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human)super.clone();

        // this is deep copy
        twin.arr = new int[twin.arr.length];
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
        return twin;
    }


}
