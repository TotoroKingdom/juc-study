package com.totoro.juc03GuardedSuspension;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:totoro
 * @createDate:2023/2/10
 * @description:
 */
public class RequestQueue {

    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest(){
        while (queue.peek() == null){
            try{
                wait();
            }catch (Exception e){

            }
        }
        return queue.remove();
    }


    public synchronized void putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }
}
