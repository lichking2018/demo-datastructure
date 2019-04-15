package com.wt.study.datastructure.queue;

public class MailQueueMonitoring implements Runnable{
    private MailQueue mailQueue;

    public MailQueueMonitoring(MailQueue mailQueue) {
        this.mailQueue = mailQueue;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("邮件队列大小:"+mailQueue.getMailQueue().size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
