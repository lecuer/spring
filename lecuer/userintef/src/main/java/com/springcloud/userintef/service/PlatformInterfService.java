package com.springcloud.userintef.service;

import com.springcloud.userintef.model.ApplyWareInfo;
import com.springcloud.userintef.model.WaresInfoRes;

public interface PlatformInterfService{

    WaresInfoRes findWaresInfo(ApplyWareInfo applyWareInfo) throws Exception;
}
