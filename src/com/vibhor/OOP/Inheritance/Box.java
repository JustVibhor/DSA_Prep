package com.vibhor.OOP.Inheritance;

public class Box {

    double length;
    double width;
    double height;

    Box() {
        length = -1;
        width = -1;
        height = -1;
    }

    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    Box(Box old) {
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

}
