package com.wuzx.thread.syncutil.coundownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo extends Thread{


    private CountDownLatch countDownLatch;

    private Random random = new Random();

    public CountDownLatchDemo(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {

        try {

            // 执行业务逻辑
            Thread.sleep(random.nextInt(1000));
            System.out.println(Thread.currentThread().getName()+"-"+"执行完成");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        countDownLatch.countDown();
    }
}
