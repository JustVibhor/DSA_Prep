package com.vibhor.OOP.Interfaces;

public class  Car implements Engine, Transmission{

    @Override
    public void start() {
        System.out.println("We dont need keys here");
    }

    @Override
    public void speed() {
        System.out.println("its kinda fast");
    }

    @Override
    public void power() {
        System.out.println("Too much power for you");
    }

    @Override
    public void type() {
        System.out.println("Not automatic for sure, wtf is stick, its manual");
    }
}
