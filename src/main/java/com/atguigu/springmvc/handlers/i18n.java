package com.atguigu.springmvc.handlers;

import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class i18n {
	
	public static final String result  = "i18n";
	public static final String result2 = "i18n_session";
	
	@Autowired
	private ResourceBundleMessageSource resources;
	
	@RequestMapping("testi18nMessage")
	public String testI18N(@RequestParam(value="lan",required=true) String lan, Map<String, Object> map){
		Locale locale = lan.equals("en") ? new Locale("en","US") : new Locale("zh","CN");
		String message = resources.getMessage("i18n.username", null, locale);
		System.out.println(message);
		map.put("message", message);
		return result;
	}
	
	@RequestMapping("testSessionLanguage")
	public ModelAndView testSessionLanguage() {
		return new ModelAndView(result2);
	}
	
	@RequestMapping("gotosession")
	public String gotoSession() {
		return "i18n_session";
	}
	
	@RequestMapping("gotosession2")
	public String gotoSession2() {
		return "i18n_session2";
	}
	
}
