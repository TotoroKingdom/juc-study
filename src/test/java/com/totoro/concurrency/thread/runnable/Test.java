package com.totoro.concurrency.thread.runnable;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
