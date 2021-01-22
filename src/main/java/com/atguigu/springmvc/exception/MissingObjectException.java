package com.atguigu.springmvc.exception;

import java.util.function.Supplier;

public class MissingObjectException extends RuntimeException {

	private static final long serialVersionUID = 2017_05_01L;

	private String objectName;

	public static Supplier<MissingObjectException> newMissingObjectException(String objectName) {
		return () -> new MissingObjectException(objectName);
	}
	
	public MissingObjectException(String objectName) {
		super("mising object :" + objectName);
		this.objectName = objectName;
	}

	public String getObjectName() {
		return objectName;
	}

}
