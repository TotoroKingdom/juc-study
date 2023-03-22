package com.totoro.concurrency.theory.unsafe;

/**
 * @author: totoro
 * @createDate: 2023 03 22 23 03
 * @description:
 **/
public class ThreadUnsafeExample {

    private int count = 0;

    public void add(){
        count++;
    }

    public int get(){
        return count;
    }
}
