package com.fiap.estruturais.bridge;

public class TV implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = Math.max(0, Math.min(100, percent));
        System.out.println("TV volume set to " + this.volume);
    }
}
