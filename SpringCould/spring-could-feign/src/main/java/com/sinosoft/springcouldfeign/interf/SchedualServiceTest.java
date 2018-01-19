package com.sinosoft.springcouldfeign.interf;

import com.sinosoft.springcouldfeign.service.SchedualServiceTestHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Service
@FeignClient (value = "spring-cloud-producer",fallback = SchedualServiceTestHystric.class)
public interface SchedualServiceTest {
    @RequestMapping (value = "/test",method = RequestMethod.GET)
    String sayTestFromClientOne(@RequestParam (value = "name") String name);
}

