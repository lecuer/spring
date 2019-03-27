package com.springcloud.userintef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankWareInfo {

    private String wares_name;
    private String wares_info;
    private String setnum;
    private String stock;
    private int buy_price;
    private int sell_price;
    private int discount;
    private String provider_name;
    private String type_name;

}
