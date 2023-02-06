package com.totoro.listener;

import com.totoro.pojo.Apple;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description: 购买苹果事件
 */
public class BuyAppleEvent extends AbstractEvent {

    private Apple apple;

    public BuyAppleEvent(Object source, Apple apple) {
        super(source);
        this.apple = apple;
    }

    public Apple getApple(){
        return apple;
    }

    public void setApple(Apple apple){
        this.apple = apple;
    }
}
