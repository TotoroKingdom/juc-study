package com.totoro.juc03GuardedSuspension;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Request {
    private final String name;

    public Request(String name){
        this.name = name;
    }

    public String getName()  {
        return name;
    }
    public String toString(){
        return "[ Request " + name + " ]";
    }
}
