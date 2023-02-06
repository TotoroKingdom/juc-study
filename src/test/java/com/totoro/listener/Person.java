package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class Person {

    private PersonListener personListener;

    public void run(){
        personListener.runBefore(new Event(this));

        System.out.println("开始跑步");

        personListener.runAfter(new Event(this));
    }

    public void registerListener(PersonListener listener){
        this.personListener = listener;
    }

}
