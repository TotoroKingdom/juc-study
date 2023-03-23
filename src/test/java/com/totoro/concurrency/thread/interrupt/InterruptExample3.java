package com.totoro.concurrency.thread.interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.interrupted;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description: 调用 Executor 的 shutdown() 方法会等待线程都执行完毕之后再关闭，但是如果调用的是 shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法。
 */
public class InterruptExample3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            while (!interrupted()){
                System.out.println("Thread run");
            }
        });

        Thread.sleep(2000);
        executorService.shutdown();
        System.out.println("Main run");
    }
}
