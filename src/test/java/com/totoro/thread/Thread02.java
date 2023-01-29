package com.totoro.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread02 {

    public static void main(String[] args) {

        new Thread(() ->{
            System.out.println("我是线程A");
        },"A").start();


        Thread01.printThread();
    }

}
