package com.totoro.concurrency.theory.safe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class StackClosedExample {

    public void add100(){
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        StackClosedExample example = new StackClosedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> example.add100());
        executorService.execute(() -> example.add100());
        executorService.shutdown();
    }
}
