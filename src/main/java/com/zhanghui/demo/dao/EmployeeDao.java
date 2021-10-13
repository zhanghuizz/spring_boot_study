package com.zhanghui.demo.dao;

import com.zhanghui.demo.pojo.Department;
import com.zhanghui.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> Employees = null;

//    @Autowired
//    private  DepartmentDao departmentDao;
    static {
        Employees = new HashMap<Integer, Employee>();

        Employees.put(101,new Employee(101,"张三","12345@qq.com",1,new Department(101,"教学部")));
        Employees.put(102,new Employee(102,"李四","666666@qq.com",1,new Department(102,"市场部")));
    }

    //主键自增
    private  static  Integer initid = 1006;

    public void save (Employee employee){
        if(employee.getId()==null){
            employee.setId(initid++);
        }

    }
}
