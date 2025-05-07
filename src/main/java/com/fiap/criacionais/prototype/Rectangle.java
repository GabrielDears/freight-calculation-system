package com.fiap.criacionais.prototype;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }
}
