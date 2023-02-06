package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class PersonListener {

    public void runBefore(Event event){
        System.out.println("热身运动");
        event.getPerson();

    }

    public void runAfter(Event event){
        event.getPerson();
        System.out.println("跑完休息一下");
    }
}
