package com.atguigu.springmvc.applicationlevel.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.atguigu.springmvc.applicationlevel.events.BlackListEvent;

@Component
public class BlackListNotifier1 implements ApplicationListener<BlackListEvent> {

    public void onApplicationEvent(BlackListEvent event) {
    	System.out.println("BlackListNotifier1 address=[" + event.getAddress() + "]; text=[" + event.getText() + "]");
    }

}