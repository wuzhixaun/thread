package com.wuzx.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {


    public static void main(String[] args) {
        System.out.println(Integer.SIZE);
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool(); // SynchronousQueue 同步队列
        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10); // LinkedBlockingQueue 无界队列
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(); //


        for (int i = 0; i < 100; i++) {
            fixedThreadPool.submit(new MyTask());
        }
    }
}


// 任务
class MyTask implements Runnable {


    int i = 0;

    @Override
    public void run() {
        System.out.println("第" + i + "员工");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        i++;
    }
}