package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description: 事件监听器
 */
public interface EventListener<E extends AbstractEvent>{

    void onEvent(E event);
}
