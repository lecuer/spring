package com.springcloud.hystrix;

import com.springcloud.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HystrixService implements HelloService {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name;
    }
}
