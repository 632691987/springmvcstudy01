package com.atguigu.springmvc.applicationlevel.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.exception.MissingObjectException;

@ControllerAdvice
public class AppExceptionHandler {

	private static final String EXCEPTION_PAGE = "exception";
	
	@ExceptionHandler(MissingObjectException.class)
	public ModelAndView handleError(HttpServletRequest req, Exception ex) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(EXCEPTION_PAGE);
		return mav;
	}
	
}
