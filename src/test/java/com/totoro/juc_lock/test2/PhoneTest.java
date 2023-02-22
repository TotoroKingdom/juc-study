package com.totoro.juc_lock.test2;


import java.util.concurrent.TimeUnit;

/**
 * @author:totoro
 * @createDate:2023/2/22
 * @description:
 */
public class PhoneTest {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();

        new Thread(() -> {
            try {
                phone.sendMsg();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {phone.call();},"B").start();

    }
}
