package com.atguigu.springmvc.requestbod_responsebody.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employeeDTO")
public class EmployeeDTO extends Employee {
	
	public EmployeeDTO() {
		super();
	}
	
	public EmployeeDTO(String name, int salary) {
		super(name, salary);
	}

}
