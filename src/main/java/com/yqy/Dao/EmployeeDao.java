package com.yqy.Dao;
//数据访问类
import com.yqy.vo.Employee;
import com.yqy.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;//数据库操作
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {
    //通过工具类得到数据对象，传递给QueryRunner
    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    public List<Employee> findAllEmployees() {
        try {
            return runner.query("select * from employee", new BeanListHandler<>(Employee.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
