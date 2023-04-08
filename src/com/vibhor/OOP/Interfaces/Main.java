package com.vibhor.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        BetterCar dodge = new BetterCar();

        dodge.upgradeEngine(new ElectricMotor());
        dodge.start();
    }
}
