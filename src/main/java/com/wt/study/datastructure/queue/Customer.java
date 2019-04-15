package com.wt.study.datastructure.queue;

public class Customer implements Runnable{
    private MailQueue mailQueue;

    public Customer(MailQueue mailQueue) {
        this.mailQueue = mailQueue;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("收到邮件任务："+mailQueue.getMailQueue().poll());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
