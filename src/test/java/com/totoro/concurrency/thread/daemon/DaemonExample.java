package com.totoro.concurrency.thread.daemon;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class DaemonExample {
    public static void main(String[] args) {

        Thread daemon = new Thread(() -> {
            System.out.println("daemon");
        });

        System.out.println(daemon.isDaemon());
        daemon.setDaemon(true);
        System.out.println(daemon.isDaemon());
    }
}
