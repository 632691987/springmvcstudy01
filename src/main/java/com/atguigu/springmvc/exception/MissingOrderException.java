package com.atguigu.springmvc.exception;

import java.util.function.Supplier;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="miss order here")
public class MissingOrderException extends RuntimeException {

	private static final long serialVersionUID = 2017_05_01L;

	private String objectName;

	public static Supplier<MissingOrderException> newMissingOrderException(String objectName) {
		return () -> new MissingOrderException(objectName);
	}
	
	public MissingOrderException(String objectName) {
		super("mising object :" + objectName);
		this.objectName = objectName;
	}

	public String getObjectName() {
		return objectName;
	}

}
