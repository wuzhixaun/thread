package com.wuzx.thread.syncutil.coundownlatch;

import java.util.concurrent.CountDownLatch;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(5);


        for (int i = 0; i < 3; i++) {


            new CountDownLatchDemo(countDownLatch).start();

        }


        // 阻塞
        countDownLatch.await();

    }
}
