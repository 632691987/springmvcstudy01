package com.atguigu.springmvc.handlers;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springmvc.dto.Address;
import com.atguigu.springmvc.dto.Country;
import com.atguigu.springmvc.dto.User;

@Controller
public class ELController {
	private static final String EL = "el/";
	private static final String REQUEST_SCOPE_PAGE = EL + "requestScope";
	
	@RequestMapping(value="elrequestScope01")
	public String testRequestScope(Map<String, Object> map) {
		
		User user = new User("m_username", "m_passport", "m@email.com", 
				new Address(Country.Canada, "K_province", "K_city", "K_detail"));
		
		map.put("time", new Date());
		map.put("user", user);
		return REQUEST_SCOPE_PAGE;
	}

}
