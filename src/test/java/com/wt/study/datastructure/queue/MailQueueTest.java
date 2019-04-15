package com.wt.study.datastructure.queue;


import org.junit.Test;

public class MailQueueTest {

    @Test
    public void test1(){
        MailQueue mailQueue = new MailQueue();

        Customer customer = new Customer(mailQueue);
        Producers producers = new Producers(mailQueue);
        MailQueueMonitoring mailQueueMonitoring = new MailQueueMonitoring(mailQueue);

        Thread tCustomer = new Thread(customer);
        tCustomer.setName("tCustomer");
        Thread tproducer = new Thread(producers);
        tproducer.setName("tproducer");
        Thread tmoti = new Thread(mailQueueMonitoring);
        tmoti.setName("tmoti");

        tCustomer.start();
        tproducer.start();
        tmoti.start();

        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
