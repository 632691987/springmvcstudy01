package com.atguigu.springmvc.converters;

import com.atguigu.springmvc.crud.entities.Department;
import com.atguigu.springmvc.crud.entities.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConvertor implements Converter<String, Employee> {
    @Override
    public Employee convert(String source) {
        //<!-- lastname-email-gender-department.id 例如: GG-gg@atguigu.com-0-105 -->
        String[] vars = source.split("-");
        if (vars != null && vars.length == 4) {
            Employee employee = new Employee();
            employee.setLastName(vars[0]);
            employee.setEmail(vars[1]);
            employee.setGender(Integer.parseInt(vars[2]));

            Department department = new Department();
            department.setId(Integer.parseInt(vars[3]));
            employee.setDepartment(department);
            return employee;
        }

        return null;
    }
}
