<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <c:url value="/css/jquery-ui.css" var="cssURL" />
    <link rel="stylesheet" type="text/css" href="${cssURL}">

    <spring:url value="/scripts/jquery-3.2.1.min.js" var="jqueryURL" htmlEscape="true"/>
    <script type="text/javascript" src="${jqueryURL}" ></script>

    <script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery-ui.js"></script>
    <title>Test ModelAttribute</title>
</head>
<body>
${requestScope.msg }
<br />
${vincentuser["username"]}
</body>
</html>