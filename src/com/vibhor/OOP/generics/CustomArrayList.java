package com.vibhor.OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;      // here we can't add list of different data types, so we have to use generics (explained in notes)
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];

    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[2*data.length];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        return data[--size];
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList obj = new ArrayList();        ArrayList<> here u can't add primitives only classes like Integer, String

        CustomArrayList list =  new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(list);

    }


}
