package com.totoro.listener_spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
    public void intelligence(){
        System.out.println("发送情报");
    }
}
