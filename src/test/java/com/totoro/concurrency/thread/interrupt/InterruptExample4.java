package com.totoro.concurrency.thread.interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.Thread.interrupted;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description: 调用 Executor 的 shutdown() 方法会等待线程都执行完毕之后再关闭，但是如果调用的是 shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法。
 */
public class InterruptExample4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> future = executorService.submit(() -> {
            while (!interrupted()){
                System.out.println("submit");
            }
        });

        Thread.sleep(100);
        future.cancel(true);
        System.out.println("Main run");
    }
}
