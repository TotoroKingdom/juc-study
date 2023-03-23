package com.totoro.concurrency.thread.interrupt;

import static java.lang.Thread.interrupted;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class InterruptExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while ( !interrupted() ){
                System.out.println("Thread run");
            }
            System.out.println("Thread end");
        });

        thread.start();
        thread.interrupt();
        System.out.println("Main run");
    }
}
