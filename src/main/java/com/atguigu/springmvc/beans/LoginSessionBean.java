package com.atguigu.springmvc.beans;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class LoginSessionBean implements Serializable {
	
	private static final long serialVersionUID = 2017_05_01l;
	private String username;
	private int touchCount=0;
	
	public LoginSessionBean() {
		this.touchCount = 0;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTouchCount() {
		return touchCount;
	}
	public void setTouchCount(int touchCount) {
		this.touchCount = touchCount;
	}
	
	public void addTouchCount() {
		this.touchCount ++;
	}
	
}
