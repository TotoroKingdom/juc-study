package com.totoro.concurrency.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable mc = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(mc);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println(futureTask.get());

    }
}
