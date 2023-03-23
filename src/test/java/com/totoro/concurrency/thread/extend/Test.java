package com.totoro.concurrency.thread.extend;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
