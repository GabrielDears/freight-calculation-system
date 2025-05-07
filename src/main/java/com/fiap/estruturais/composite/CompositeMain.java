package com.fiap.estruturais.composite;

public class CompositeMain {

    public static void main(String[] args) {
        FileSystemComponent file = new File();
        Folder folder = new Folder();
        Folder folder1 = new Folder();
        folder.add(file);
        folder.add(null);
        folder.add(folder);
        folder.add(folder1);
        folder.print();
    }

}
