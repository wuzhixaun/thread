package com.wuzx.thread.jmm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    private volatile static int sum = 0;
    private static Object object = "";
    static ReentrantLock lock = new ReentrantLock();
    static AtomicInteger sums = new AtomicInteger();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {

                for (int j = 0; j < 10000; j++) {
                    sums.incrementAndGet();
                }

            }).start();

        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(sums.get());

    }



}
