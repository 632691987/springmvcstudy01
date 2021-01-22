<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Session Scope Bean testing</title>
</head>
<body>
<!-- 
http://localhost:8080/basic_xml/sessionbeanscope2.jsp

这个页面是为了测试一个session bean 的。流程开发是这样，
1, 首先，这个页面模仿成一个登陆页面，输入username 和 password (提交到[com.atguigu.springmvc.handlers.SessionScopeController])
2, 然后假装在后台模拟得到填充整个session bean，
3, 然后redirect 去到views 下面，并且显示出session bean 的信息。并且显示该username 已经来到这个页面多少次了。
4, 再次进入这个页面，如果已经有username 的情况下，将会出现一个连接，并且显示username，这个链接能直接去到后台的controller, 然后再次去到 step 3 的view 页面，去一次，计数器会加一次
5, 用别的浏览器进入http://localhost:8080/basic_xml/sessionbeanscope1.jsp，模仿 step 1 - step 4的操作
6, 进入http://localhost:8080/basic_xml/sessionbeanscope2.jsp，可以看到有多少个人进入，列出username, 并且显示出对应的计数器的值
结论要是：
* 两个浏览器互相不影响。
* session bean 起作用。
 -->
欢迎${sessionScope["scopedTarget.loginSessionBean"]["username"]} 进来。<br />
<a href="http://localhost:8080/basic_xml/sessionbeanscope1.jsp">回去sessionbeanscope1.jsp</a>
</body>
</html>