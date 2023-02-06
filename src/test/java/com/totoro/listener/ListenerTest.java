package com.totoro.listener;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class ListenerTest {

    public static void main(String[] args) {
        Person person = new Person();


        person.registerListener(new PersonListener());

        person.run();

    }



}
