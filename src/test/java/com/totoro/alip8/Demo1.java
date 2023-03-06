package com.totoro.alip8;

/**
 * @author: totoro
 * @createDate: 2023 02 22 23 20
 * @description:
 **/
public class Demo1 {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("123");
        },"A").start();
    }
}
