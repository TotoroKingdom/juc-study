package com.totoro.service;

import com.totoro.listener.BuyAppleEvent;
import com.totoro.listener.EventListenerSendSms;
import com.totoro.listener.EventMulticaster;
import com.totoro.pojo.Apple;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Service
public class AppleServiceImpl implements AppleService {

    @Resource
    private EventMulticaster eventMulticaster;

    @Override
    public void buyApple(Apple apple) {
        System.out.println("totoro购买了一个苹果:" + apple);

        eventMulticaster.addEventListener(new EventListenerSendSms<>());
        //广播事件
        eventMulticaster.multicastEvent(new BuyAppleEvent(this, apple));
    }



}
