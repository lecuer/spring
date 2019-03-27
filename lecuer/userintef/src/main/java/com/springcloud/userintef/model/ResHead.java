package com.springcloud.userintef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResHead {

    private String RequestType;

    private String  ResponseCode;

    private int ResultNumber;

    private String ErrorCode;

    private String ErrorMessage;
}
