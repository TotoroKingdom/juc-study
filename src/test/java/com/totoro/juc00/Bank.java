package com.totoro.juc00;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Bank {
    private int money;
    private String name;


    public Bank(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void deposit(int m)   {
        money = money + m;
    }

    public boolean withdraw(int m) {
        if (money > m) {
            money = money - m;
//            check();
            return true;
        } else {
            return false;
        }
    }
    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public void check(){
        if (money < 0){
            System.out.println("可用余额为负数");
        }
    }

}
