package com.wuzx.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadStatus {

    public static void main(String[] args) throws InterruptedException {

        final Thread thread = new Thread(()->{
            LockSupport.park();
        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(1000);
        System.out.println(thread.getState());

    }
}
