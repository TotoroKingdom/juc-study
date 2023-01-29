package com.totoro.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author:totoro
 * @createDate:2023/1/29
 * @description:
 */
public class Thread01 {
    public static void printThread(){

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.getAllThreadIds();
        ThreadInfo[] infos = bean.getThreadInfo(ids);
        for (ThreadInfo info : infos) {
            System.out.println(info.getThreadName());
        }
    }
}
