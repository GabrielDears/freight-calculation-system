package com.fiap.estruturais.bridge;

public class BasicRemote implements Remote {

    private final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.enable();
    }

    @Override
    public void off() {
        device.disable();
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}
