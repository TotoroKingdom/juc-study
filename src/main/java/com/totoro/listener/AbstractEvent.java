package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:  事件对象
 */
public abstract class AbstractEvent {

    protected Object source;

    public AbstractEvent(Object source){
        this.source = source;
    }

    public Object getSource(){
        return source;
    }

    public void setSource(Object source){
        this.source = source;
    }
}
