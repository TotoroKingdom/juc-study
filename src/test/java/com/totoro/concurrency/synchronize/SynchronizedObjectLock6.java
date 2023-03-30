package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedObjectLock6 implements Runnable{

    static SynchronizedObjectLock6 instance1 = new SynchronizedObjectLock6();
    static SynchronizedObjectLock6 instance2 = new SynchronizedObjectLock6();

    @Override
    public void run() {

        synchronized (SynchronizedObjectLock6.class){

            System.out.println("我是线程：" + Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "结束");

        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance1);
        Thread thread1 = new Thread(instance2);
        thread.start();
        thread1.start();
    }
}
