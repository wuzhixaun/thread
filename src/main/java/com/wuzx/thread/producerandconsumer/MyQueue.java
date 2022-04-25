package com.wuzx.thread.producerandconsumer;

import lombok.val;

public class MyQueue {

    private String[] data = new String[10];

    private int getIndex = 0;
    private int putIndex = 0;
    private int size;


    /**
     * 设置元素
     *
     * @param element
     * @throws InterruptedException
     */
    public synchronized void put(String element) throws InterruptedException {
        // 满了
        if (data.length == size) {
            // 等待
            wait();

            // 如果唤醒，则重新竞争锁资源
            put(element);
        } else {
            put0(element);
        }

        // 唤醒消费者进行消费
        notify();
    }


    public void put0(String element) {
        data[putIndex] = element;
        size++;
        putIndex++;
        if (putIndex == data.length) {
            putIndex = 0;
        }
    }


    /**
     * 消费
     * @return
     */
    public synchronized String get() throws InterruptedException {
        if (size == 0) {
            wait();

            // 如果唤醒，则重新竞争锁资源
            return get();
        } else {

            // 唤醒生产者
            final String result = get0();
            notify();
            return result;
        }
    }


    private String get0() {
        final String result = data[getIndex];

        getIndex++;
        size--;
        if (getIndex == data.length) {
            getIndex = 0;
        }

        return result;
    }


}
