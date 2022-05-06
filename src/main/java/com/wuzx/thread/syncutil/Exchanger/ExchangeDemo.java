package com.wuzx.thread.syncutil.Exchanger;

import java.util.Random;
import java.util.concurrent.Exchanger;

/**
 * @author wuzhixuan
 * @version 1.0.0
 * @ClassName ExchangeDemo.java
 * @Description TODO
 * @createTime 2022年05月06日 17:32:00
 */
public class ExchangeDemo {


    public static void main(String[] args) {


        Exchanger<String> exchanger = new Exchanger<>();
        Random random = new Random();

        new Thread("线程1") {
            public void run() {

                while (true) {
                    try {
                        String otherData = exchanger.exchange("交换数据1");
                        System.out.println(Thread.currentThread().getName() + "得到<==" + otherData);
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();

        new Thread("线程2") {
            public void run() {

                while (true) {
                    try {
                        String otherData = exchanger.exchange("交换数2");
                        System.out.println(Thread.currentThread().getName() + "得到<==" + otherData);
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();


        new Thread("线程31") {
            public void run() {

                while (true) {
                    try {
                        String otherData = exchanger.exchange("交换数据3");
                        System.out.println(Thread.currentThread().getName() + "得到<==" + otherData);
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();

    }
}
