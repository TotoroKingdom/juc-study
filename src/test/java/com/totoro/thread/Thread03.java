package com.totoro.thread;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread03 {
    public static void main(String[] args) {

        new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println("我是线程：" + currentThread.getName());
            int sum = 0;
            for (int i = 1; i <= 1000; i++) {
                if (i == 100){
                    currentThread.stop();
                }
                sum += i;
            }
            System.out.println("result=" + sum);
        }).start();
        System.out.println("主线程");
    }
}
