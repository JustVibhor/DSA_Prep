package com.vibhor.OOP.generics.ObjectCloning;

public class Main {


    public Main() throws CloneNotSupportedException {
        Human Vibhor = new Human(23, "Vibhor");
        Human other = new Human(Vibhor);

        Human twin = (Human)Vibhor.clone();
    }
}
