package com.totoro.concurrency.thread.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class SynchronizedExample {

    public static void main(String[] args) {
       SynchronizedExample example = new SynchronizedExample();
       SynchronizedExample example2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() ->{
            example.fun1();
            example.fun2();
        });
        executorService.execute(() ->{
            example2.fun1();
            example2.fun2();
        });

    }

    /**
     * 作用于类和静态方法
     */
    public void fun2(){
        synchronized (SynchronizedExample.class){
            for (int i = 0; i < 10; i++) {
                System.out.print(i+"A ");
            }
        }
    }

    /**
     * 作用于代码块和方法
     */
    public void fun1(){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
