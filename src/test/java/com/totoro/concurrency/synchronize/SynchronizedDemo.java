package com.totoro.concurrency.synchronize;

/**
 * @author:totoro
 * @createDate:2023/3/30
 * @description:
 */
public class SynchronizedDemo {

    Object object = new Object();

    public void method1(){
        synchronized (object){

        }
        method2();
    }

    private static void method2(){

    }
}
