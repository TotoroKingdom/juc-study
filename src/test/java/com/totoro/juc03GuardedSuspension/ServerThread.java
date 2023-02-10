package com.totoro.juc03GuardedSuspension;

import lombok.SneakyThrows;

import java.util.Random;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class ServerThread extends Thread{

    private final Random random;
    private final RequestQueue requestQueue;

    public ServerThread(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.requestQueue = requestQueue;
        this.random  = new Random(seed);
    }

    @SneakyThrows
    public void run(){
        for (int i = 0; i < 10000; i++) {
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName()+" handle " + request);
            Thread.sleep(random.nextInt(1000));
        }
    }

}
