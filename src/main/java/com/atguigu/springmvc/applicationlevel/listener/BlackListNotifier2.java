package com.atguigu.springmvc.applicationlevel.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import com.atguigu.springmvc.applicationlevel.events.BlackListEvent;

@Component
@EnableAsync(proxyTargetClass = true)
public class BlackListNotifier2{

	@EventListener(condition="#event.text != 'abc'")
	@Async
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("BlackListNotifier2 Address=[" + event.getAddress() + "]; Text=[" + event.getText() + "]");
        if(event.getText().contains("def")){
        	throw new RuntimeException("throw exception from BlackListNotifier2");
        }
    }
}