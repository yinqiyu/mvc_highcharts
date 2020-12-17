package com.yqy.Dao;

import com.yqy.vo.Explorer;
import com.yqy.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ExplorerDao {
    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
    public List<Explorer>findAllExplorers(){
        try {
            return runner.query("select * from explorer", new BeanListHandler<>(Explorer.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
