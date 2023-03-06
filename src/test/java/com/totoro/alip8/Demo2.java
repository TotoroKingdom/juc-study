package com.totoro.alip8;

import java.util.concurrent.TimeUnit;

/**
 * @author: totoro
 * @createDate: 2023 03 06 21 53
 * @description: 守护线程
 **/
public class Demo2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().isDaemon());
        }, "t1");

        t1.setDaemon(true);
        t1.start();

        Thread.sleep(3000);
    }
}
