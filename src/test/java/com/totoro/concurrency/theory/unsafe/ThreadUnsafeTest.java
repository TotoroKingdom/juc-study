package com.totoro.concurrency.theory.unsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: totoro
 * @createDate: 2023 03 22 23 04
 * @description:
 **/
public class ThreadUnsafeTest {
    public static void main(String[] args) throws InterruptedException {

        final int theadSize = 1000;
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        final CountDownLatch countDownLatch = new CountDownLatch(theadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < theadSize; i++) {
            executorService.execute(() ->{
                example.add();
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());

    }
}
