<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>SpringMVC<spring:message code="internationalisation" /></title>
</head>
<body>
    Language: 
    <a href="?lang=zh_CN">中文</a> - 
    <a href="?lang=en_US">English</a>
    <h2>
        <spring:message code="i18n.username" />
    </h2>
    Locale: ${pageContext.response.locale }<br />
    
    <a href="${pageContext.request.contextPath }/gotosession">goto session2</a>
</body>
</html>