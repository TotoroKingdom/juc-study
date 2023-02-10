package com.totoro.juc00;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class PrintThread extends Thread{

    private String msg;

    public PrintThread(String msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(msg);
        }
    }
}
