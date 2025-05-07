package com.fiap.criacionais.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.putShape("circle", new Circle(10));
        shapeCache.putShape("rectangle", new Rectangle(10, 20));
        Circle circle = (Circle) shapeCache.getShape("circle");
        circle.draw();
        Rectangle rectangle = (Rectangle) shapeCache.getShape("rectangle");
        rectangle.draw();
    }

}
