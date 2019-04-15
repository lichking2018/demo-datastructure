package com.wt.study.datastructure.queue;

public class Producers implements Runnable{
    private MailQueue mailQueue;

    public Producers(MailQueue mailQueue) {
        this.mailQueue = mailQueue;
    }

    @Override
    public void run() {
        while(true){
            mailQueue.getMailQueue().offer("发送邮件：邮件内容"+Math.random());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
