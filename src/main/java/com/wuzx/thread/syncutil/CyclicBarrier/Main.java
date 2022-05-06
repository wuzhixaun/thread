package com.wuzx.thread.syncutil.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author wuzhixuan
 * @version 1.0.0
 * @ClassName Main.java
 * @Description TODO
 * @createTime 2022年05月06日 16:21:00
 */
public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

        for (int i = 0; i < 5; i++) {
            new CyclicBarrierDemo("同学" + i, cyclicBarrier).start();
        }

    }
}
