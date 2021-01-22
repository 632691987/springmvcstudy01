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
关于异常处理，有下面几种处理方法：
1, 直接在controller 同一个class 写。(例如com.atguigu.springmvc.handlers.TestExecptionController.handleError)
2, 开一个新的com.atguigu.springmvc.applicationlevel.exceptionhandler.AppExceptionHandler去处理(要用@ControllerAdvice)
3, 直接在com.atguigu.springmvc.exception.MissingOrderException 上面写出错该异常的时候该有的httpCode
4, 配置 org.springframework.web.servlet.handler.SimpleMappingExceptionResolver
 -->
<a href="${pageContext.request.contextPath }/testException?value=missobject">测试  miss object exception</a><br />
<a href="${pageContext.request.contextPath }/testException?value=missorder">测试  miss order exception</a><br />
<a href="${pageContext.request.contextPath }/testException?value=misscode">测试  miss code exception</a><br />
<a href="${pageContext.request.contextPath }/testException?value=missname">测试  miss name exception</a><br />
</body>
</html>