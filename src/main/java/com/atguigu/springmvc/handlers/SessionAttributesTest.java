package com.atguigu.springmvc.handlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.atguigu.springmvc.dto.Address;
import com.atguigu.springmvc.dto.Country;
import com.atguigu.springmvc.dto.User;

/**
 * SessionAttributes only put on class
 */
@SessionAttributes(value={SessionAttributesTest.USERKEY}, types={String.class})
@Controller
public class SessionAttributesTest {
	
	public static final String USERKEY = "user";
	
	public static final String result = "sessionAttributes";

	/**
	 * http://localhost:22900/interview/sessionAttributes
	 */
	@RequestMapping("sessionAttributes")
	public String testSessionAttributes(Map<String, Object> map) {
		
		User user = new User("m_username", "m_passport", "m@email.com", 
				new Address(Country.Canada, "K_province", "K_city", "K_detail"));
		map.put(USERKEY, user);
		map.put("school", "atguigu");
		return result;
	}
}
