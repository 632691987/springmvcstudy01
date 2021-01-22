package com.atguigu.springmvc.applicationlevel.events;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = 1L;
	private final String address;
    private final String text;

    public BlackListEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

	public String getAddress() {
		return address;
	}

	public String getText() {
		return text;
	}

}
