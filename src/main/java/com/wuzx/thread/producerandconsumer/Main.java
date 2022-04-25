package com.wuzx.thread.producerandconsumer;

public class Main {


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 3; i++) {
            new ConsumerThread(myQueue).start();
        }
        for (int i = 0; i < 5; i++) {
            new ProducerThread(myQueue).start();
        }
    }
}
