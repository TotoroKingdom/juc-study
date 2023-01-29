package com.totoro.jucbase;

import java.util.Arrays;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Juc01 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,5,2,4};

        for (int i : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(i * 1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
