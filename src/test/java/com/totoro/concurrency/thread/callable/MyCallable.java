package com.totoro.concurrency.thread.callable;

import java.util.concurrent.Callable;

/**
 * @author:totoro
 * @createDate:2023/3/23
 * @description:
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}
