package com.totoro.concurrency.thread.cooperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class WaitNotifyExample {

    public synchronized void before(){
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after(){
        try{
            wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}
