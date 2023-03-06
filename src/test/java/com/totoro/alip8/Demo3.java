package com.totoro.alip8;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

/**
 * @author: totoro
 * @createDate: 2023 03 06 22 00
 * @description:
 **/
public class Demo3 {

    @SneakyThrows
    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();

        FutureTask futureTask = new FutureTask<Object>(myThread2);

        Thread ft1 = new Thread(futureTask, "ft1");

        ft1.start();

        Object o = futureTask.get();
        System.out.println(o);

    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {

    }
}

class MyThread2 implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("call");
        return "hello";
    }
}
