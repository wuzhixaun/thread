package com.wuzx.thread.producerandconsumer;

import java.util.Random;

public class ProducerThread extends Thread {

    private final MyQueue myQueue;
    private final Random random = new Random();
    private int index = 0;

    public ProducerThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        while (true) {
            String tmp = "ele-" + index;
            try {
                myQueue.put(tmp);
                System.out.println("添加元素:" + tmp);
                index++;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
