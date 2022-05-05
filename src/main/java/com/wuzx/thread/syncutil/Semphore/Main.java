package com.wuzx.thread.syncutil.Semphore;

import java.util.concurrent.Semaphore;

public class Main {


    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        for (int i = 0; i < 5; i++) {
            new SemphoreDemo("学生" + i, semaphore).start();
        }
    }
}
