package com.wuzx.thread.producerandconsumer;

import java.util.Random;

public class ConsumerThread extends Thread {

    private final MyQueue myQueue;
    private final Random random = new Random();

    public ConsumerThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                String s = myQueue.get();
                System.out.println("\t\t消费元素:" + s);
                Thread.sleep(random.nextInt(1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
