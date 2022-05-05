package com.wuzx.thread.syncutil.Semphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemphoreDemo extends Thread{


    private Semaphore semaphore;
    private Random random = new Random();

    public SemphoreDemo(String name,Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }


    @Override
    public void run() {
        try {
            // 获取信表
            semaphore.acquire();
            // 执行业务逻辑
            System.out.println(Thread.currentThread().getName()+"-"+"抢到了座位，开始写作业");
            Thread.sleep(random.nextInt(1000));
            System.out.println(Thread.currentThread().getName()+"-"+"作业写完，腾出座位");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 释放信标
        semaphore.release();
    }
}
