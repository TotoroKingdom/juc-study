package com.totoro.juc02Immutable;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alice", "Alaska");

        new PrintPerson(person).start();
        new PrintPerson(person).start();
        new PrintPerson(person).start();
    }
}
