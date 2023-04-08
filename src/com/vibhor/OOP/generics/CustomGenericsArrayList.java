package com.vibhor.OOP.generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T extends Number> {      // providing type here (T)

    private Object[] data;      // As object class is at the top of the food chain
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        data = new Object[DEFAULT_SIZE];

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
        Object[] temp = new Object[2*data.length];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
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

        CustomGenericsArrayList<Integer> list =  new CustomGenericsArrayList();
        list.add(1);
        list.add(2);
        list.add(4);

        for (int i = 0; i < 10; i++) {
            list.add(list.get(i)*i);
        }

        System.out.println(list);

        String a = new String("hi");

    }


}
