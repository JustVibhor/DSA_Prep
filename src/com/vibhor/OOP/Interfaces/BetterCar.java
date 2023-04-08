package com.vibhor.OOP.Interfaces;

public class BetterCar {
    private Engine engine;
    private Media media = new MediaPlayer();

    public BetterCar() {
        engine = new PowerEngine();
    }

    public BetterCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
