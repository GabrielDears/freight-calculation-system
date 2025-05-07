package com.fiap.criacionais.object_pool;

public class ObjectPoolMain {

    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(3);
        var acquire = objectPool.acquire();
        var acquire1 = objectPool.acquire();
        var acquire2 = objectPool.acquire();
        objectPool.release(acquire);
        objectPool.release(acquire1);
        objectPool.release(acquire2);
        var w = objectPool.acquire();
        var x = objectPool.acquire();
        var y = objectPool.acquire();
        var z = objectPool.acquire();
    }

}
