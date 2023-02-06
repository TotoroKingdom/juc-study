package com.totoro.jucbase;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Juc02 {
    private static int a = 0;
    private static int b = 0;
    public static void main(String[] args) {

        new Thread(() -> {
            if (b == 1){
                if (a == 0){
                    System.out.println("A");
                }else {
                    System.out.println("B");
                }
            }
        }).start();

        new Thread(() ->{
            a = 1;
            b = 1;
        }).start();



    }
}
