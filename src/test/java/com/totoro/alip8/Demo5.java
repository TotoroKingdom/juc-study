package com.totoro.alip8;

import lombok.SneakyThrows;

import java.util.concurrent.FutureTask;

/**
 * @author: totoro
 * @createDate: 2023 03 06 22 20
 * @description:
 **/
public class Demo5 {
    @SneakyThrows
    public static void main(String[] args) {

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
        long start = System.currentTimeMillis();

        new Thread(f1).start();
        new Thread(f2).start();
        new Thread(f3).start();
        f1.get();
        f2.get();
        f3.get();

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
