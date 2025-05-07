package com.fiap.estruturais.proxy;

public class VideoProxy implements Video {

    private RealVideo realVideo;

    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo();
        }
        System.out.println("Loading video...");
        realVideo.play();
        System.out.println("Video loaded successfully!");
    }

}
