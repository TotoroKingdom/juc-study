package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedObjectLock implements Runnable{

    static SynchronizedObjectLock instance = new SynchronizedObjectLock();

    @Override
    public void run() {

        synchronized (this){
            System.out.println("线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"结束");
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);
        thread.start();
        thread1.start();
    }
}
