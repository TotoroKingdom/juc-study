package com.totoro.listener_spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {

    public void test(){
        System.out.println("监听器方法");
    }

    @Override
    public void onApplicationEvent(MyEvent event) {
        event.intelligence();
    }
}
