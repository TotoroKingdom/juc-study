package com.totoro.listener_spring;

import org.springframework.context.ApplicationContext;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class HelloService {

    private ApplicationContext applicationContext;

    public void hello(){
        System.out.println("hello listener");
        applicationContext.publishEvent(new MyEvent(this));
    }

    public void registerApplicationContext(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }
}
