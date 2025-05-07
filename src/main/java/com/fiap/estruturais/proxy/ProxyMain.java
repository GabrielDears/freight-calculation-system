package com.fiap.estruturais.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Video video = new VideoProxy();
        video.play(); // Lazy loading will happen here
        System.out.println("\nPlaying again...");
        video.play(); // Now it's already loaded
    }
}
