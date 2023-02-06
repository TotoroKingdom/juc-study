package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class Event {

    private Person person;

    public Event(Person person){
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
}
