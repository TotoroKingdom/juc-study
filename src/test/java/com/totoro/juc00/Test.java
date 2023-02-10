package com.totoro.juc00;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank("AA",1000);

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                bank.deposit(100);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                bank.withdraw(100);
            }
        }).start();

        Thread.sleep(3000);
        System.out.println(bank.getMoney());
    }
}
