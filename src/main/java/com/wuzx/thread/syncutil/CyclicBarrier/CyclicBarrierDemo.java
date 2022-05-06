package com.wuzx.thread.syncutil.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author wuzhixuan
 * @version 1.0.0
 * @ClassName CyclicBarrierDemo.java
 * @Description 相当于一个栅栏
 * @createTime 2022年05月06日 16:12:00
 */
public class CyclicBarrierDemo extends Thread {


    CyclicBarrier cyclicBarrier;
    Random random = new Random();


    public CyclicBarrierDemo(String name, CyclicBarrier cyclicBarrier) {
        super(name);
        this.cyclicBarrier = cyclicBarrier;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(random.nextInt(2000));
            System.out.println(Thread.currentThread().getName() + " - 已经到 达公司");
            cyclicBarrier.await();

            Thread.sleep(random.nextInt(2000));
            System.out.println(Thread.currentThread().getName() + " - 已经笔 试结束");
            cyclicBarrier.await();
            Thread.sleep(random.nextInt(2000));
            System.out.println(Thread.currentThread().getName() + " - 已经面 试结束");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}
