package com.totoro.juc_lock.test1;

import com.totoro.juc_lock.test1.Phone;

import java.util.concurrent.TimeUnit;

/**
 * @author:totoro
 * @createDate:2023/2/22
 * @description:
 */
public class PhoneTest {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();

        new Thread(() -> {phone.sendMsg();},"A").start();

        TimeUnit.SECONDS.sleep(4);

        new Thread(() -> {phone.call();},"B").start();

    }
}
