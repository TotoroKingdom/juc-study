package com.totoro.thread;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread08 {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        Thread t = new Thread(() -> {
            local.set("lbwnb");
            new Thread(() -> {
                System.out.println(local.get());
            }).start();
        });
        t.start();
    }

}
