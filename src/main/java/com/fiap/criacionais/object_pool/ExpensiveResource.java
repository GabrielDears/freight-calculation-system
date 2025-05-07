package com.fiap.criacionais.object_pool;

public class ExpensiveResource {

    private final String id;

    public ExpensiveResource() throws InterruptedException {
        Thread.sleep(1000);
        id = "ExpensiveResource-" + System.currentTimeMillis();
    }

    public void use() {
        System.out.println("Using " + id);
    }

    public String getId() {
        return id;
    }
}
