package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedObjectLock2 implements Runnable{

    static SynchronizedObjectLock2 instance = new SynchronizedObjectLock2();

    Object block1 = new Object();
    Object block2 = new Object();

    @Override
    public void run() {
        synchronized (block1){
            System.out.println("block1锁，线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block1锁，" + Thread.currentThread().getName() + "结束");
        }

        synchronized (block2){
            System.out.println("block2锁，线程："+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block2锁，" + Thread.currentThread().getName() + "结束");
        }

    }

    public static void main(String[] args) {

        Thread thread = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread.start();
        thread2.start();
    }
}
