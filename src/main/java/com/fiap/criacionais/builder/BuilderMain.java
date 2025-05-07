package com.fiap.criacionais.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setCpu("CPU")
                .setRam("RAM")
                .setStorage("STORAGE")
                .build();
        Computer computer2 = new Computer.ComputerBuilder()
                .setCpu("CPU2")
                .setRam("RAM2")
                .setStorage("STORAGE2")
                .build();

        System.out.println(computer.getCpu());
        System.out.println(computer.getRam());
        System.out.println(computer.getStorage());
        System.out.println(computer2.getCpu());
        System.out.println(computer2.getRam());
        System.out.println(computer2.getStorage());

        System.out.println(computer);
        System.out.println(computer2);
    }

}
