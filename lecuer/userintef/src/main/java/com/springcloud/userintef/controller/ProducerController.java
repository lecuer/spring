package com.springcloud.userintef.controller;

import com.springcloud.userintef.utils.ActiveManager;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "JmsProducer",produces = "application/json")
public class ProducerController {

    @Autowired
    ActiveManager activeManager;

    @RequestMapping(value="/addQueue",method = RequestMethod.POST)
    public void addQueue(){
        ActiveMQQueue destination = new ActiveMQQueue("queueTest");
        activeManager.send(destination,"sucess");
    }
    /**
     * 新增消息队列(延迟)
     */
    @RequestMapping(value = "/addLazyQueue", method = RequestMethod.GET)
    public void addDelayQueue() {
        System.out.println(LocalDateTime.now());
        activeManager.delaySend("success", "beyondLiDelayQueueTest", 5000L);
    }

}
