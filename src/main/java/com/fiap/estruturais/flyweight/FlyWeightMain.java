package com.fiap.estruturais.flyweight;

public class FlyWeightMain {

    public static void main(String[] args) {
        BaseComponentFactory baseComponentFactory = new BaseComponentFactory();

        BaseComponent parent1 = baseComponentFactory.createBaseComponent("parent1");
        BaseComponent parent2 = baseComponentFactory.createBaseComponent("parent2");
        BaseComponent parent3 = baseComponentFactory.createBaseComponent("parent2");

        ParentComponent parentComponent = new ParentComponent(parent1);
        ParentComponent parentComponent2 = new ParentComponent(parent1);
        ParentComponent parentComponent3 = new ParentComponent(parent2);
        ParentComponent parentComponent4 = new ParentComponent(parent2);
        ParentComponent parentComponent5 = new ParentComponent(parent2);
        ParentComponent parentComponent6 = new ParentComponent(parent3);
        ParentComponent parentComponent7 = new ParentComponent(parent3);
        ParentComponent parentComponent8 = new ParentComponent(parent3);

    }

}
