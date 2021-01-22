package com.atguigu.springmvc.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springmvc.applicationlevel.service.EmailService;

@Controller
public class EventController {
	
	@Autowired
	private EmailService emailService;
	
	private static final String SUCCESS = "success";
	
	@GetMapping("publishSentMail")
	public String testSendEmail(@RequestParam(value="mail",required=true) String emailAddress,
								@RequestParam(value="text",required=true) String text) {
		emailService.sendEmail(emailAddress, text);
		return SUCCESS;
	}
	
}
