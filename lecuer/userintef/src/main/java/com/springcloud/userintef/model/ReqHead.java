package com.springcloud.userintef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqHead {
    //渠道代码
    private String channelCode;
    //请求类型
    private String reqType;
    //渠道名称
    private String channelName;
    //服务代码
    private String serviceType;
    //交易流水号
    private String transNo;
}
