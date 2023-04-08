package com.vibhor.OOP.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);  // calling the parent class constructor, to initialise values present in parent class

        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
}
