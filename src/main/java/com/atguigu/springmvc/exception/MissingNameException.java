package com.atguigu.springmvc.exception;

import java.util.function.Supplier;

/**
 */
//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="miss code here")
public class MissingNameException extends RuntimeException {

	private static final long serialVersionUID = 2017_05_01L;

	private String objectName;

	public static Supplier<MissingNameException> newMissingObjectException(String objectName) {
		return () -> new MissingNameException(objectName);
	}
	
	public MissingNameException(String objectName) {
		super("mising object :" + objectName);
		this.objectName = objectName;
	}

	public String getObjectName() {
		return objectName;
	}

}
