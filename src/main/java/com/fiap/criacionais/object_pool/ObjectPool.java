package com.fiap.criacionais.object_pool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class ObjectPool {

    private final Logger logger = Logger.getLogger(ObjectPool.class.getName());
    private final int maxSize;
    private final Queue<ExpensiveResource> availableResources = new LinkedList<>();
    private int totalCreated = 0;

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized ExpensiveResource acquire() {
        if (!availableResources.isEmpty()) {
            ExpensiveResource res = availableResources.poll();
            System.out.println("Reusing resource: " + res.getId());
            return res;
        }

        if (totalCreated < maxSize) {
            try {
                ExpensiveResource res = new ExpensiveResource();
                totalCreated++;
                System.out.println("Creating new resource: " + res.getId());
                return res;
            } catch (InterruptedException e) {
                logger.warning("Error creating resource: " + e.getMessage());
            }
        }

        throw new RuntimeException("No available resources and pool limit reached!");
    }

    public synchronized void release(ExpensiveResource resource) {
        System.out.println("Releasing resource: " + resource.getId());
        availableResources.offer(resource);
    }
}
