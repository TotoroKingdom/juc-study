package com.totoro;

/**
 * @author: totoro
 * @createDate: 2023 02 13 04 10
 * @description:
 **/
public class Test {

    public static void main(String[] args) {

        long a = 100;
        long total = 100;

        for (int i = 0; i < 10; i++) {
            System.out.println(total + "   " + a/(total*1.0)*100 + "%");
            a = a * 2;
            total = total + total * 2;
        }

        System.out.println("per=" + a/(total*1.0)*100);
        System.out.println("total=" + total);

    }
}
