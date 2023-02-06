package com.totoro.listener;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Component
public class EventMulticasterImpl implements EventMulticaster {

    private Map<Class<?>, List<EventListener>> listenerMap = new ConcurrentHashMap<>();

    @Override
    public void multicastEvent(AbstractEvent event) {
        System.out.println("开始广播");
        List<EventListener> list = listenerMap.get(event.getClass());
        if ( !ObjectUtils.isEmpty(list) ){
            for (EventListener eventListener : list) {
                System.out.println("监听器："+ getEventType(eventListener) + " 开始监听");
                eventListener.onEvent(event);
            }
        }else {
            System.out.println("当前没有监听器监听，请添加一个");
        }

    }

    @Override
    public void addEventListener(EventListener<?> listener) {
        Class<?> eventType = getEventType(listener);
        List<EventListener> eventListeners = listenerMap.get(eventType);
        if (ObjectUtils.isEmpty(eventListeners)){
            eventListeners = new ArrayList<>();
            listenerMap.put(eventType, eventListeners);
        }
        eventListeners.add(listener);
    }

    @Override
    public void removeEventListener(EventListener<?> listener) {
        Class<?> eventType = getEventType(listener);
        List<EventListener> eventListeners = listenerMap.get(eventType);
        if (ObjectUtils.isEmpty(eventListeners)){
            listenerMap.remove(eventType, eventListeners);
        }

    }

    /**
     * 获取具体的监听类型
     * @param listener
     * @return
     */
    protected Class<?> getEventType(EventListener listener){
        ParameterizedType parameterizedType = (ParameterizedType) listener.getClass().getGenericInterfaces()[0];
        Class<?> eventType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        return eventType;
    }
}
