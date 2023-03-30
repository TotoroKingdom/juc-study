package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedDemo2 {

    public static void main(String[] args) {
        SynchronizedDemo2 demo2 = new SynchronizedDemo2();
        demo2.method1();
    }

    private synchronized void method1(){
        System.out.println(Thread.currentThread().getId() + ": method1()");
        method2();
    }

    private synchronized void method2(){
        System.out.println(Thread.currentThread().getId()+": method2()");
        method3();
    }

    private synchronized void method3(){
        System.out.println(Thread.currentThread().getId()+": method3()");
    }
}
