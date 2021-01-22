package com.atguigu.springmvc.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.atguigu.springmvc.dto.SessionLogin;
import com.atguigu.springmvc.service.SessionLoginService;

@Controller
public class SessionScopeController {
	
	private static final String RESULT = "loginCount";
	private SessionLoginService service;
	
	@Autowired
	public SessionScopeController(SessionLoginService service) {
		this.service = service;
	}
	
	@PostMapping("sessionbeanlogin")
	public String testPojo(SessionLogin sessionLogin, Map<String, Object> map) {
		service.addUserTouchCount(sessionLogin.getUsername());
		map.put("sessionLoginBean", service.getSessionBean());
		System.out.println(service.getSessionBean().toString());
		return RESULT;
	}
}
