package com.totoro.juc02Immutable;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public final class Person {

    private final String name;

    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return "[ Person: name = "+ name + ", address = " + address + "]";
    }
}
