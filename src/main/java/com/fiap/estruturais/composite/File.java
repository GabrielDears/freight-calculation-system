package com.fiap.estruturais.composite;

public class File implements FileSystemComponent {
    @Override
    public void print() {
        System.out.println("Printing File...");
    }
}
