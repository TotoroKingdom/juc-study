package com.totoro.juc01SingleThreadedExecution;

import java.util.concurrent.Semaphore;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Worker {

    private final Semaphore semaphore;
    private final int workerNumber;

    public Worker(int workerNumber) {
        this.workerNumber = workerNumber;
        this.semaphore = new Semaphore(workerNumber);
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName()+"开始干活");
        semaphore.release();
        System.out.println(Thread.currentThread().getName()+"干完了");
    }
}
