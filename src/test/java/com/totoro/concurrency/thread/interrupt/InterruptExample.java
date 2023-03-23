package com.totoro.concurrency.thread.interrupt;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        thread.interrupt();
        System.out.println("Main run");
    }
}
