package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedObjectLock5 implements Runnable{

    static SynchronizedObjectLock5 instance1 = new SynchronizedObjectLock5();
    static SynchronizedObjectLock5 instance2 = new SynchronizedObjectLock5();

    @Override
    public void run() {
        method();
    }

    public static synchronized void method(){
        System.out.println("我是线程：" + Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance1);
        Thread thread1 = new Thread(instance2);
        thread.start();
        thread1.start();
    }

}
