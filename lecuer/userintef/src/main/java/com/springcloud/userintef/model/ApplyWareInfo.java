package com.springcloud.userintef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplyWareInfo {

    private String providerName;
    private String typeName;
    private String waresName;
    private String waresType;

}
