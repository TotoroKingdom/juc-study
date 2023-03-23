package com.totoro.concurrency.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description: 一个任务创建一个线程
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Thread(() -> {
                System.out.println("哈哈哈" + finalI);
            }));
        }


    }
}
