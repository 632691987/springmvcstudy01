package com.atguigu.springmvc.crud.handlers;

import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springmvc.crud.dao.DepartmentDao;
import com.atguigu.springmvc.crud.dao.EmployeeDao;
import com.atguigu.springmvc.crud.entities.Employee;

@Controller
public class EmployeeHandler {
	
	private static final String CRUD = "crud";
	private static final String LIST = CRUD + "/list";
	private static final String INPUT = CRUD + "/input";
	
	private static final String REDIRECT_EMPS = "redirect:/emps";
	
	private static final Log logger = LogFactory.getLog(EmployeeHandler.class);

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;

	@ModelAttribute
	public void getEmployee(
			@RequestParam(value="id",required=false) Integer id,
			Map<String, Object> map){
		if(id != null){
			map.put("employee", employeeDao.get(id));
		}
	}
	
	@PutMapping(value="/emp")
	public String update(Employee employee){
		employeeDao.save(employee);
		
		return REDIRECT_EMPS;
	}

	@PostMapping("testConversionServiceConverer")
	public String testConversionServiceConverer(@RequestParam("employee") Employee employee) {
		employeeDao.save(employee);
		return REDIRECT_EMPS + employee.getId();
	}
	
	@GetMapping(value="/emp/{id}")
	public String input(@PathVariable("id") Integer id, Map<String, Object> map){
		map.put("employee", employeeDao.get(id));
		map.put("departments", departmentDao.getDepartments());
		return INPUT;
	}
	
	@DeleteMapping(value="/emp/{id}")
	public String delete(@PathVariable("id") Integer id){
		employeeDao.delete(id);
		return REDIRECT_EMPS;
	}
	
	@PostMapping(value="/emp")
	public String save(@Valid Employee employee, Errors result, 
			Map<String, Object> map){
		System.out.println("save: " + employee);
		
		if(result.getErrorCount() > 0){
			
			for(FieldError error:result.getFieldErrors()) {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
            }
			map.put("departments", departmentDao.getDepartments());
			return INPUT;
		}
		
		employeeDao.save(employee);
		return REDIRECT_EMPS;
	}

	@GetMapping(value="/emp")
	public String input(Map<String, Object> map){
		map.put("departments", departmentDao.getDepartments());
		map.put("employee", new Employee());
		return INPUT;
	}
	
	@GetMapping("/emps")
	public String list(Map<String, Object> map){
		logger.info("list all employees");
		map.put("employees", employeeDao.getAll());
		return LIST;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields("lastName");
	}
	
}
