package com.totoro.concurrency.thread.reentrant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class LockExample {


    private Lock lock = new ReentrantLock();

    public void func(){
        lock.lock();
        try{
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> lockExample.func());
        executorService.execute(() -> lockExample.func());
    }
}
