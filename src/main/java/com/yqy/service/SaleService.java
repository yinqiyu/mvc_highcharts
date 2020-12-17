package com.yqy.service;

import com.yqy.Dao.SaleDao;
import com.yqy.vo.Sale;
import flexjson.JSONSerializer;

import java.util.List;

/**
 * 业务层
 */
public class SaleService {
    private final SaleDao saleDao = new SaleDao();
    /**
     * 查询所有sale,
     * @return
     */
    public List<Sale> findAllSales(){
        return saleDao.findAllSales();

    }
//将数据转换成json对象
    public String toJson(List<Sale>sales){
        //创建JSON转换对象
        JSONSerializer serializer = new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(sales);

    }
}
