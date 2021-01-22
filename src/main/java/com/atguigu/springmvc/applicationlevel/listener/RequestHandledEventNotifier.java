package com.atguigu.springmvc.applicationlevel.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class RequestHandledEventNotifier {

	@EventListener(condition = "#blEvent.description != 'no description, impossible'")
	public void processRequestHandledEvent01(RequestHandledEvent blEvent) {
//		System.out.println("getDescription:" + blEvent.getDescription());
//		System.out.println("getProcessingTimeMillis:" + blEvent.getProcessingTimeMillis());
//		System.out.println("getSessionId:" + blEvent.getSessionId());
//		System.out.println("getShortDescription:" + blEvent.getShortDescription());
//		System.out.println("getTimestamp:" + blEvent.getTimestamp());
//		System.out.println("getUserName:" + blEvent.getUserName());
//		System.out.println("event.getClass().getName():" + blEvent.getClass().getName());
//		System.out.println("event.getSource():" + blEvent.getSource());
	}

}
