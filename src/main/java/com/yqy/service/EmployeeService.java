package com.yqy.service;

import com.yqy.Dao.EmployeeDao;
import com.yqy.vo.Employee;
import flexjson.JSONSerializer;

import java.util.List;
/**
 * 业务层
 */
public class EmployeeService {
    private final EmployeeDao employeeDao = new EmployeeDao();

    /**
     * 查询所有的员工,
     * @return
     */
    public List<Employee> findAllEmployees() {
        return employeeDao.findAllEmployees();
    }

    public String toJson(List<Employee>employees){
        //创建JSON转换对象
        JSONSerializer serializer = new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(employees);

    }
}
