package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springmvc.views.BeanNameView;

@Controller
public class TestBeanNameViewResolverController {
	
	/**
	 *
	 * 
	 * URL: 
	 */
	@RequestMapping("/testBeanNameViewResolver")
	public String testView(){
		System.out.println("calling com.atguigu.springmvc.handlers.TestBeanNameViewResolver.testView()");
		return BeanNameView.VIEW_NAME;
	}
	
}
