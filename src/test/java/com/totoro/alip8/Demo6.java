package com.totoro.alip8;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author: totoro
 * @createDate: 2023 03 06 22 24
 * @description:
 **/
public class Demo6 {

    @SneakyThrows
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Demo4 demo4 = new Demo4();
        FutureTask<String> f1 = new FutureTask<>(() -> {
            demo4.fun1();
            return "task1";
        });
        FutureTask<String> f2 = new FutureTask<>(() -> {
            demo4.fun2();
            return "task2";
        });
        FutureTask<String> f3 = new FutureTask<>(() -> {
            demo4.fun3();
            return "task3";
        });

        executorService.submit(f1);
        executorService.submit(f2);
        executorService.submit(f3);

        f1.get();
        f2.get();
        f3.get();


        executorService.shutdown();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
