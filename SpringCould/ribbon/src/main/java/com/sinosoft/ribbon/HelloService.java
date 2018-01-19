package com.sinosoft.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@SuppressWarnings("unused")
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand (fallbackMethod = "testError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://spring-cloud-producer/test?name="+name,String.class);
    }

    public String testError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}