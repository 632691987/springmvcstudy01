package com.atguigu.springmvc.handlers;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springmvc.dto.User;

@Controller
public class PojoController {
	
	private static final String POJO = "pojo";

	@RequestMapping("pojo")
	public String testPojo(User user, Map<String, Object> map) {
		map.put("userobject", user);
		map.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
		System.out.println(user);
		return POJO;
	}

}
