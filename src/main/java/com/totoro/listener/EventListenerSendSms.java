package com.totoro.listener;

import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Component
public class EventListenerSendSms<E extends AbstractEvent> implements EventListener<BuyAppleEvent> {
    @Override
    public void onEvent(BuyAppleEvent event) {
        System.out.println("发短信——>您购买的是："+event);
    }

}
