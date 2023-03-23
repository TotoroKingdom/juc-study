package com.totoro.concurrency.thread.runnable;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable");
    }
}
