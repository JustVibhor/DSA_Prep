package com.vibhor.OOP.generics.ComparingObjects;

public class Student implements Comparable<Student>{
    public int rollNo;
    public float marks;
    String name;


    public Student(int rollNo, float marks, String name) {
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        return diff;
    }
}
