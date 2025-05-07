package com.fiap.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private final List<FileSystemComponent> components = new ArrayList<>();

    public void add(FileSystemComponent component) {
        if (null != component && !this.equals(component)) {
            components.add(component);
        }
    }

    @Override
    public void print() {
        System.out.println("Printing Folder...");
        if (!components.isEmpty()) {
            System.out.println("Folder contains:");
            components.forEach(FileSystemComponent::print);
        }
    }
}
