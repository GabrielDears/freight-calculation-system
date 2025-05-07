package com.fiap.criacionais.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeId) {
        Shape cachedShape = shapes.get(shapeId);
        System.out.println("Cloning a " + cachedShape.getClass().getSimpleName() + "...");
        return cachedShape.clone();
    }


    public void putShape(String shapeId, Shape shape) {
        shapes.put(shapeId, shape);
    }

}
