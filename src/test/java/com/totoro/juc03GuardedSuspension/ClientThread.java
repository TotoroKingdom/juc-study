package com.totoro.juc03GuardedSuspension;

import lombok.SneakyThrows;

import java.util.Objects;
import java.util.Random;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class ClientThread extends Thread {
    private final Random random;
    private final RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.random = new Random(seed);
        this.requestQueue = requestQueue;
    }

    @SneakyThrows
    public void run(){
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName() + "request:" + request);
            requestQueue.putRequest(request);
            Thread.sleep(random.nextInt(1000));

        }
    }

}
