package com.atguigu.springmvc.applicationlevel.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import com.atguigu.springmvc.applicationlevel.events.BlackListEvent;

@Service
public class EmailService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
	
	public void sendEmail(String address, String text) {
		BlackListEvent event = new BlackListEvent(this, address, text);
        publisher.publishEvent(event);
        System.out.println("event Send");
    }

}
