package com.vibhor.OOP.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice() {
        super();
        this.price = -1;
    }



    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight); // calls BoxPrice(l, w, h, weight)
        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
}

