package com.totoro.alip8;

import lombok.SneakyThrows;

/**
 * @author: totoro
 * @createDate: 2023 03 06 22 17
 * @description:
 **/
public class Demo4 {

    @SneakyThrows
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Demo4 demo = new Demo4();
        demo.fun1();
        demo.fun2();
        demo.fun3();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }

    public void fun1() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void fun2() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void fun3() throws InterruptedException {
        Thread.sleep(1000);
    }


}


