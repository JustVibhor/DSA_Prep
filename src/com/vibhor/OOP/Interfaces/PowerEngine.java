package com.vibhor.OOP.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void speed() {
        System.out.println("Power Engine stop");
    }
}
