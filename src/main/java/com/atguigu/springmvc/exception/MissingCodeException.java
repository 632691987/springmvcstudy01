package com.atguigu.springmvc.exception;

import java.util.function.Supplier;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="miss code here")
public class MissingCodeException extends RuntimeException {

	private static final long serialVersionUID = 2017_05_01L;

	private String objectName;

	public static Supplier<MissingCodeException> newMissingObjectException(String objectName) {
		return () -> new MissingCodeException(objectName);
	}
	
	public MissingCodeException(String objectName) {
		super("mising object :" + objectName);
		this.objectName = objectName;
	}

	public String getObjectName() {
		return objectName;
	}

}
