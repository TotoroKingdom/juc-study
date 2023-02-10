package com.totoro.juc01SingleThreadedExecution;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class WorkerTest {

    public static void main(String[] args) {

        Worker worker = new Worker(3);
        for (int i = 0; i < 20; i++) {
            new Thread(() ->{
                try {
                    worker.work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"i="+i).start();
        }
    }
}
