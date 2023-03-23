package com.totoro.concurrency.thread.extend;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread hello");
    }
}
