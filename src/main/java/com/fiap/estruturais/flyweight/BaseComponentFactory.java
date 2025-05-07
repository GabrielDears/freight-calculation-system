package com.fiap.estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BaseComponentFactory {

    private final Map<String, BaseComponent> components = new HashMap<>();

    public BaseComponent createBaseComponent(String parentName) {
        return components.computeIfAbsent(parentName, ignored -> new BaseComponent());
    }

}
