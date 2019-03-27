package com.springcloud.userintef.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class JMSConsumerService {

    @JmsListener(destination = "queueTest")
    public void getQueueInfo(String info){
        log.info("进入消息队列监听接口！");
        log.info("监听到的对象为："+info);

    }

    //
    @JmsListener(destination = "beyondLiDelayQueueTest")
    public void getDelayQueue(String info) {
        System.out.println("成功监听beyondLiQueueTest消息队列，传来的值为:" + info + "当前时间为" + LocalDateTime.now());
    }

}
