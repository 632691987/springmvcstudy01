package com.atguigu.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springmvc.beans.LoginSessionBean;

@Service
public class SessionLoginService {
	
	@Autowired
	private LoginSessionBean sessionBean;
	
	public void addUserTouchCount(String username) {
		sessionBean.setUsername(username);
		sessionBean.addTouchCount();
	}

	public LoginSessionBean getSessionBean() {
		return sessionBean;
	}
	
}
