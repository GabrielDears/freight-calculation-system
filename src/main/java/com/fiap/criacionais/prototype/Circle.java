package com.fiap.criacionais.prototype;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }
}
