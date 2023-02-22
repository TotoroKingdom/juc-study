package com.totoro.juc_lock.test1;

/**
 * @author:totoro
 * @createDate:2023/2/22
 * @description:
 */
public class Phone {
    public synchronized void sendMsg(){
        System.out.println("发短信");
    }

    public synchronized void call(){
        System.out.println("打电话");
    }
}


