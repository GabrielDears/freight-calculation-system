package com.fiap.criacionais.builder;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    private Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, ram, storage);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage + "]";
    }
}
