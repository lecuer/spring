package com.springcloud.userintef.service.impl;

import com.springcloud.userintef.entity.WaresInfoEntity;
import com.springcloud.userintef.model.ApplyWareInfo;
import com.springcloud.userintef.model.ResHead;
import com.springcloud.userintef.model.WaresInfoRes;
import com.springcloud.userintef.repostories.WareInfoRepostory;
import com.springcloud.userintef.service.PlatformInterfService;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("PlatformInterfService")
public class PlatformInterfImpl implements PlatformInterfService{

    @Resource
    private WareInfoRepostory wareInfoRepostory;

    @Override
    public WaresInfoRes findWaresInfo(ApplyWareInfo applyWareInfo) throws Exception{

        WaresInfoRes waresInfoRes = new WaresInfoRes();
        ResHead resHead = new ResHead();
        try {
            String str = "select a.wares_name,a.wares_type,a.provider,a.setnum,a.stock,a.buy_price,a.sell_price," +
                    "a.discount from Wares_info a,Wares_provider b,Wares_type c where 1=1";
            StringBuffer sql = new StringBuffer(str);
            if (applyWareInfo.getProviderName() != null && !"".equals(applyWareInfo.getProviderName())) {
                sql.append(" and b.provider_name='").append(applyWareInfo.getProviderName()).append("'").append(" and b.provider_id = a.provider");
            }
            if (applyWareInfo.getTypeName() != null && !"".equals(applyWareInfo.getTypeName())) {
                sql.append(" and c.type_name='").append(applyWareInfo.getTypeName()).append("'").append(" and c.type_id = a.wares_type");
            }
            if (applyWareInfo.getWaresName() != null && !"".equals(applyWareInfo.getWaresName())) {
                sql.append(" and a.wares_name='").append(applyWareInfo.getWaresName()).append("'");
            }
            if (applyWareInfo.getWaresType() != null && !"".equals(applyWareInfo.getWaresType())) {
                sql.append(" and a.wares_type='").append(applyWareInfo.getWaresType()).append("'");
            }

            QueryRunner query=new QueryRunner();
            String sqlStr = new String(sql);
            System.out.print(sqlStr);
            //List<WaresInfoEntity> applyWareInfoList = query.query(conn,sqlStr,new BeanListHandler<WaresInfoEntity>(WaresInfoEntity.class));
            List<WaresInfoEntity> applyWareInfoList = wareInfoRepostory.findAllBySQL(sqlStr);
            if(applyWareInfoList.size()>=99){
                resHead.setResultNumber(applyWareInfoList.size());
                waresInfoRes.setResHead(resHead);
            }else{
                waresInfoRes.setResHead(resHead);
                waresInfoRes.setWaresInfoEntities(applyWareInfoList);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return waresInfoRes;
    }
}
