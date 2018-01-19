package com.sinosoft.springcouldfeign.controller;

import com.sinosoft.springcouldfeign.interf.SchedualServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    SchedualServiceTest schedualServiceTest;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String sayTest(@RequestParam String name){
        return schedualServiceTest.sayTestFromClientOne(name);
    }
}