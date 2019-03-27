package com.springcloud.userintef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaresInfoReq {

    private ReqHead reqHead;
    private ApplyWareInfo applyWareInfo;

 }
