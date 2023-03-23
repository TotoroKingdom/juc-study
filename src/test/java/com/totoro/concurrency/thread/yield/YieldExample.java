package com.totoro.concurrency.thread.yield;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class YieldExample {
    public static void main(String[] args) {

        new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                if (i==50){
                    Thread.yield();
                }
            }
        }).start();

        new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("B"+i);
            }
        }).start();

    }
}
