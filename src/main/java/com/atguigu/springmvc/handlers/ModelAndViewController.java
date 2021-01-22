package com.atguigu.springmvc.handlers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.dto.Address;
import com.atguigu.springmvc.dto.Country;
import com.atguigu.springmvc.dto.User;

@Controller
public class ModelAndViewController {

	private static final String POJO = "pojo";
	
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(){
		String viewName = POJO;
		ModelAndView modelAndView = new ModelAndView(viewName);
		
		User user = new User("m_username", "m_passport", "m@email.com", 
				new Address(Country.Canada, "K_province", "K_city", "K_detail"));

		modelAndView.addObject("userobject", user);
		modelAndView.addObject(Arrays.asList("Tom", "Jerry", "Mike"));
		
		return modelAndView;
	}

	@ModelAttribute("vincentuser")
	public User getVincentUser() {
		return new User("m2_username", "m2_passport", "m2@email.com",
				new Address(Country.Canada, "K2_province", "K2_city", "K2_detail"));
	}
	
}
