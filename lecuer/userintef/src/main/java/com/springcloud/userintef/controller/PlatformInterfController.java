package com.springcloud.userintef.controller;

import com.springcloud.userintef.model.ApplyWareInfo;
import com.springcloud.userintef.model.WaresInfoReq;
import com.springcloud.userintef.model.WaresInfoRes;
import com.springcloud.userintef.service.PlatformInterfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/commons")
@Slf4j
public class PlatformInterfController{

    @Resource
    private PlatformInterfService platformInterfService;

    @RequestMapping(value = "/waresinfointerf")
    public WaresInfoRes reportRegisterIntef() throws Exception {

        //@RequestBody WaresInfoReq waresInfoReq
        log.info("进入商品信息查询接口！");
        WaresInfoRes waresInfoRes = new WaresInfoRes();
        WaresInfoReq waresInfoReq = new WaresInfoReq();
        ApplyWareInfo applyWareInfo = new ApplyWareInfo();
        applyWareInfo.setProviderName("北京华晨电子科技");
        applyWareInfo.setWaresName("iphone Xs");
        waresInfoReq.setApplyWareInfo(applyWareInfo);
        if(waresInfoReq!=null&&waresInfoReq.getApplyWareInfo()!=null){

            applyWareInfo = waresInfoReq.getApplyWareInfo();
            waresInfoRes = platformInterfService.findWaresInfo(applyWareInfo);
        }
        return waresInfoRes;
    }
}
