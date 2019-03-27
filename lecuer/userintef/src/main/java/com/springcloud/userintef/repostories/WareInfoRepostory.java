package com.springcloud.userintef.repostories;

import com.springcloud.userintef.entity.WaresInfoEntity;

import java.util.List;

public interface WareInfoRepostory {

    List<WaresInfoEntity> findAllBySQL(String sqlStr);
}
