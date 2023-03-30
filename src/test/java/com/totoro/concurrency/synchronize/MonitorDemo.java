package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class MonitorDemo {
    private int a = 0;

    public synchronized void writer(){
        a++;
    }

    public synchronized void reader(){
        int i =a;
    }
}
