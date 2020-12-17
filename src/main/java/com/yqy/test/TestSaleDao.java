package com.yqy.test;

import com.yqy.Dao.SaleDao;
import com.yqy.vo.Sale;
import com.yqy.service.SaleService;
import org.junit.Test;

import java.util.List;

public class TestSaleDao {
    SaleDao saleDao = new SaleDao();
    SaleService saleService = new SaleService();

    @Test
    public void testfindAllSales(){
        List<Sale>sales = saleDao.findAllSales();
        for (Sale sale:sales){
            System.out.println(sale);
        }
    }

    @Test
    public void testToJson(){
        List<Sale>sales = saleService.findAllSales();
        //创建JSON转换器
        String toJson = saleService.toJson(sales);
        System.out.println(toJson);
    }

}
