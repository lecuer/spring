package com.sinosoft.consumer;

import com.sinosoft.service.ConsumerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ConsumerApplicationHystrix implements ConsumerService {

    @Override
    public String test(@RequestParam (value = "name") String name) {
        return "test" +name+", this messge send failed ";
    }
}
