package com.totoro.juc03GuardedSuspension;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class Main {
    public static void main(String[] args) {

        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue,"Alice",3141592L).start();
        new ServerThread(requestQueue,"Bobby",6535897L).start();
    }
}
