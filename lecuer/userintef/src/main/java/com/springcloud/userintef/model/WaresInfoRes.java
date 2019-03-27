
package com.springcloud.userintef.model;


import com.springcloud.userintef.entity.WaresInfoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaresInfoRes {

    private ResHead resHead;
    private List<WaresInfoEntity> waresInfoEntities;
}
