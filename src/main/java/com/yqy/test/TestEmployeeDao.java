package com.yqy.test;

import com.yqy.Dao.EmployeeDao;
import com.yqy.vo.Employee;
import com.yqy.service.EmployeeService;
import com.yqy.utils.DataSourceUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.util.List;

public class TestEmployeeDao {
    EmployeeDao employeeDao = new EmployeeDao();
    EmployeeService employeeService = new EmployeeService();

    @Test
    public void testGetDataSource()throws  Exception{
        DataSource ds = DataSourceUtils.getDataSource();
        System.out.println(ds);
//        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
//        System.out.println(connection);
    }

    @Test
    public void testFindAllEmployees(){
        List<Employee>employees = employeeDao.findAllEmployees();
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

    @Test
    public void testToJson(){
       List<Employee>employees= employeeService.findAllEmployees();
       String toJson = employeeService.toJson(employees);
        System.out.println(toJson);
    }
}
