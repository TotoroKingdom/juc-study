package com.totoro.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 9, 3, 6, 0));
        list.parallelStream().forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
        System.out.println("================");
        list.parallelStream().forEachOrdered(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));
    }
}
