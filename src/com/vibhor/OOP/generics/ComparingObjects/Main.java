package com.vibhor.OOP.generics.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Vibhor = new Student(40, 33, "Vibhor");
        Student Rahul = new Student(20, 50, "Rahul");
        Student Garry = new Student(13, 54, "Garry");
        Student Dj = new Student(20, 58, "Dj");
        Student Amit = new Student(9, 40, "Amit");
        Student Angad = new Student(11, 55, "Angad");

        Student[] list = {Vibhor, Rahul, Garry, Dj, Amit, Angad};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));   // lambda expression


        System.out.println(Arrays.toString(list));

        if(Vibhor.compareTo(Rahul) > 0) {
            System.out.println("Wtf");
        } else {
            System.out.println("R u dumb");
        }
    }
}
