package com.totoro.juc_lock.test2;

import java.util.concurrent.TimeUnit;

/**
 * @author:totoro
 * @createDate:2023/2/22
 * @description:
 */
public class Phone {

    public synchronized void sendMsg() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("发短信");
    }

    public synchronized void call(){
        System.out.println("打电话");
    }

}
