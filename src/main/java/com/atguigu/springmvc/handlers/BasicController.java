package com.atguigu.springmvc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {

	private static final String SUCCESS = "success";
	
	/**
	 http://localhost:22900/interview/helloworld
	 */
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("hello world");
		return SUCCESS;
	}
	
	/**
	 * http://localhost:22900/interview/helloworld2
	 */
	@RequestMapping("/helloworld2")
	public ModelAndView testBeanView() {
		String viewName = SUCCESS;
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("time", new Date());
		
		return modelAndView;
	}
	
	/**
	 * http://localhost:22900/interview/testFilterMethod?age=10&name=aa1
	 * http://localhost:22900/interview/testFilterMethod?age=10&name=val1 ==> this has no result because params already restrict
	 */
	@GetMapping(value="/testFilterMethod", params = {"age", "name!=val1"})
	public String testFilterMethod01() {
		System.out.println("com.atguigu.springmvc.handlers.BasicController.testFilterMethod01() called");
		return SUCCESS;
	}
	
	/**
	 * http://localhost:22900/interview/testFilterMethod?age=10&name=val1
	 */
	//@GetMapping(value="/testFilterMethod", params = {"age", "name=val1"}, headers = {"Accept-Encoding: gzip, deflate, br"})
	@GetMapping(value="/testFilterMethod", params = {"age", "name=val1"})
	public String testFilterMethod02() {
		System.out.println("com.atguigu.springmvc.handlers.BasicController.testFilterMethod02() called");
		return SUCCESS;
	}
	
	@PostMapping(value="/testPostMethod")
	public String testPostMethod(@RequestParam(value="name",required=true) String name) {
		System.out.println("name:" +name);
		return SUCCESS;
	}
	
	@DeleteMapping(value="/testDeleteMethod")
	public String testDeleteMethod(@RequestParam(value="name",required=true) String name) {
		System.out.println("name:" +name);
		return SUCCESS;
	}
	
	@PutMapping(value="/testPutMethod")
	public String testPutMethod(@RequestParam(value="name",required=true) String name) {
		System.out.println("name:" +name);
		return SUCCESS;
	}
	
	@GetMapping(value="/testGetMethod")
	public String testGetMethod(@RequestParam(value="name",required=true) String name) {
		System.out.println("name:" +name);
		return SUCCESS;
	}

	@GetMapping(value = "testjspforward")
	public String testJSPForward() {
		return "jspforwardfrom";
	}

	@GetMapping(value = "testjspinclude")
	public String testjspinclude() {
		return "testjspinclude";
	}
	
}
