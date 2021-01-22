package com.atguigu.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.exception.MissingCodeException;
import com.atguigu.springmvc.exception.MissingNameException;
import com.atguigu.springmvc.exception.MissingObjectException;

@Controller
public class TestExecptionController {
	
	private static final String EXCEPTION_PAGE = "exception";
	
	@GetMapping(value={"/testException"})
	public String testExceptionMapping(@RequestParam(value="value",required=true) String value) {
		if(value.equalsIgnoreCase("missobject")){
			throw new MissingObjectException("miss an object");
		}
		else if(value.equalsIgnoreCase("missorder")){
			throw new MissingObjectException("miss an order");
		}
		else if(value.equalsIgnoreCase("misscode")){
			throw new MissingCodeException("miss code");
		}
		else if(value.equalsIgnoreCase("missname")){
			throw new MissingNameException("miss name");
		}
		return "success";
	}
	
	/**
	 */
	@ExceptionHandler(MissingObjectException.class)
	public ModelAndView handleError(HttpServletRequest req, Exception ex) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(EXCEPTION_PAGE);
		return mav;
	}
	
}
