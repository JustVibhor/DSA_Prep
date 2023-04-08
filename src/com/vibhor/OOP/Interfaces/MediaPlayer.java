package com.vibhor.OOP.Interfaces;

public class MediaPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Start the music fam");
    }

    @Override
    public void stop() {
        System.out.println("Stop is garbage ass music");
    }
}
