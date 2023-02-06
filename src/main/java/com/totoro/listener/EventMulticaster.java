package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description: 事件广播器
 */
public interface EventMulticaster {

    /**
     * 广播事件给所有监听器
     * @param event
     */
    void multicastEvent(AbstractEvent event);

    /**
     * 注册一个监听器
     * @param listener
     */
    void addEventListener(EventListener<?> listener);

    /**
     * 移除一个监听器
     * @param listener
     */
    void removeEventListener(EventListener<?> listener);
}
