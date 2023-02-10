package com.totoro.juc01SingleThreadedExecution;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Test");

        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alalala").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();


    }
}
