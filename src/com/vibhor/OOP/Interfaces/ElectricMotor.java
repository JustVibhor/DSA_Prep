package com.vibhor.OOP.Interfaces;

public class ElectricMotor implements Engine{
    @Override
    public void start() {
        System.out.println("Motor start");
    }

    @Override
    public void speed() {
        System.out.println("Motor stop");
    }
}
