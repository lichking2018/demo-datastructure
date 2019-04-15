package com.wt.study.datastructure.queue;

import java.util.LinkedList;

public class LimitQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();
    private int limit;

    public LimitQueue(int limit) {
        this.limit = limit;
    }

    public void offer(T element){
        if(queue.size()>=limit){
            System.out.println("警告，队列已经满了！剔除最前端内容");
            queue.poll();
        }
        queue.offer(element);
    }

    public int size(){
        return queue.size();
    }

    public T poll(){
        return queue.poll();
    }

}
