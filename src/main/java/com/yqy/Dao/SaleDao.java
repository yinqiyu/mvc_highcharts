package com.yqy.Dao;

import com.yqy.vo.Sale;
import com.yqy.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;


//数据访问类类
public class SaleDao {
//数据源的结果传给QueryRunner
    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    public List<Sale> findAllSales() {
        try {
            return runner.query("select * from sale", new BeanListHandler<>(Sale.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
