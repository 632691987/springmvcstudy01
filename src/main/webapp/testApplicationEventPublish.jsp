<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Session Attributes</title>
</head>
<body>
<!-- 
实验：一旦发出这个，controller 就应该调用 com.atguigu.springmvc.applicationlevel.service.EmailService
然后EmailService 发出一个event, 然后应该 com.atguigu.springmvc.applicationlevel.listener.BlackListNotifier 接收到，并且做出相应的action.
但是这个应该action 同时返回到success 页面（随便有点页面返回而已，重点是测试publish 和 notifier）

从而实现解耦

实验下来，只要三个元素：
1， com.atguigu.springmvc.applicationlevel.events.BlackListEvent定义一个event(也可以是使用Spring-Framework的event)
2, com.atguigu.springmvc.applicationlevel.service.EmailService(重点是它implement ApplicationEventPublisherAware)
3, com.atguigu.springmvc.applicationlevel.listener.BlackListNotifier1 接收这个event(当然，也可以接收Spring的event)

注意：
在学习的例子里，搞了两个Notifier, 其中
com.atguigu.springmvc.applicationlevel.listener.RequestHandledEventNotifier 是新出的例子，可以不需要implements ApplicationListener, 更加方便。
com.atguigu.springmvc.applicationlevel.listener.BlackListNotifier2 也是对应的 annoation, 但是用了async [重点：class 头部一定一定要加 @EnableAsync]
只要用 @Component 和 @EventListener 就可以了。甚至可以有 filtering(condition = ....), 用的是SpEL 表达式

注意：只有所有的notifier 相应完毕后， EmailService 里面的 publishEvent 才算调用完成。(除非有notifier 使用了 async)
 -->
<a href="${pageContext.request.contextPath }/publishSentMail?mail=aa@cc.org&text=content1">测试发出一个event, 期待一切正常</a><br />
<a href="${pageContext.request.contextPath }/publishSentMail?mail=aa@cc.org&text=abc">测试发出一个event,期待notifier2 不会相应</a><br />
<a href="${pageContext.request.contextPath }/publishSentMail?mail=aa@cc.org&text=def">测试发出一个event,期待notifier2 发出异常</a><br />
</body>
</html>