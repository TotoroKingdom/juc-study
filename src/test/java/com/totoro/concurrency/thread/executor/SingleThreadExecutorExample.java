package com.totoro.concurrency.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description: 相当于大小为1的FixedThreadPool
 */
public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {

            int finalI = i;
            executorService.execute(new Thread(() ->{
                System.out.println("hhh"+ finalI);
            }));
        }
    }
}
