package com.totoro.listener_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@SpringBootApplication
public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Test.class, args);
//        applicationContext.publishEvent(new MyEvent(new HelloService()));

        HelloService helloService = new HelloService();
        helloService.registerApplicationContext(applicationContext);
        helloService.hello();
    }
}
