package com.sinosoft.service;

import com.sinosoft.consumer.ConsumerApplicationHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer",fallback = ConsumerApplicationHystrix.class)
public interface ConsumerService {
    @RequestMapping (value = "/test")
    public String test(@RequestParam (value = "name") String name);

}