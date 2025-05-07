package com.fiap.estruturais.proxy;

public class RealVideo implements Video {

    public RealVideo() {
        System.out.println("Creating real video...");
    }

    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}
