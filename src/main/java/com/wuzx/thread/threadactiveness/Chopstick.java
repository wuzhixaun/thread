package com.wuzx.thread.threadactiveness;

import java.util.concurrent.locks.ReentrantLock;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Fox
 * 筷子
 */
@Data
@AllArgsConstructor
public class Chopstick {
    int number;

    @Override
    public String toString() {
        return "筷子{" + number + '}';
    }
}

