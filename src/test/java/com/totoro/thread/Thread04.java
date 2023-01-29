package com.totoro.thread;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread04 {
    private static int value = 0;

    private static synchronized void add() {
        value++;
    }
    public static void main(String[] args) throws InterruptedException {

        Thread04 test1 = new Thread04();
        Thread04 test2 = new Thread04();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                add();
            }
            System.out.println("线程1完成");
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                add();
            }
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);  //主线程停止1秒，保证两个线程执行完成
        System.out.println(value);
    }
}
