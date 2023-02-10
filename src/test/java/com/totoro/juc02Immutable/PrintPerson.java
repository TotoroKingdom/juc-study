package com.totoro.juc02Immutable;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class PrintPerson extends Thread{

    private Person person;

    public PrintPerson(Person p){
        person = p;
    }

    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName() + ":" + person);
        }
    }
}
