package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	private static final String POCPAGE = "poc";
	
	@GetMapping("thymeleaf01")
	public String pocTest() {
		return POCPAGE;
	}
}
