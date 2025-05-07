package com.fiap.criacionais.prototype;

public abstract class Shape {

    public abstract Shape clone();

    public void draw() {
        System.out.println("Drawing shape");
    }

}
