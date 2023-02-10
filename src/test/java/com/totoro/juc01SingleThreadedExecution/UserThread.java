package com.totoro.juc01SingleThreadedExecution;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class UserThread extends Thread{

    private final Gate gate;

    private final String name;

    private final String address;

    public UserThread(Gate gate, String name, String address) {
        this.gate = gate;
        this.name = name;
        this.address = address;
    }

    public void run(){
        System.out.println(name+" begin");
        while (true){
            gate.pass(name,address);
        }
    }
}
