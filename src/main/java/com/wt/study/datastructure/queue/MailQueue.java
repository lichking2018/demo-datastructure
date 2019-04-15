package com.wt.study.datastructure.queue;

import java.util.*;

public class MailQueue {

    public LimitQueue getMailQueue() {
        return mailQueue;
    }

    private LimitQueue<String> mailQueue = new LimitQueue(20);

}
