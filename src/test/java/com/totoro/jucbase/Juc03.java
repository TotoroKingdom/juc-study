package com.totoro.jucbase;


/**
 * @author:totoro
 * @createDate:2023/2/5
 * @description:
 */
public class Juc03 {
    private static int a =0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() ->{
            while (a == 0){
                synchronized (Juc03.class){}

            }
            System.out.println("线程结束");
        }).start();

        Thread.sleep(1000);
        System.out.println("正在修改a的值");
        synchronized (Juc03.class){
            a = 1;
        }

    }
}
