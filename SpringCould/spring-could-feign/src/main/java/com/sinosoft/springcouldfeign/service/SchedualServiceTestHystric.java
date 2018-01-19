package com.sinosoft.springcouldfeign.service;

import com.sinosoft.springcouldfeign.interf.SchedualServiceTest;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceTestHystric implements SchedualServiceTest{

    @Override
    public String sayTestFromClientOne(String name) {
        return "Sorry，error information"+name;
    }
}
