package com.totoro.concurrency.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description: 所有任务只能使用固定大小的线程
 */
public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {

            int finalI = i;
            executorService.execute(new Thread(() ->{
                System.out.println("hhh"+ finalI);
            }));
        }
    }
}
