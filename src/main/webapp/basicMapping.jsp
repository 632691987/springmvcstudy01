<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic mapping page</title>
</head>
<body>
<h4>Basic mapping page</h4>

	<form action="${pageContext.request.contextPath }/testGetMethod" method="get">
		<input type="text" value="Test Get Value" id="name" name="name"><!-- 注意了，前台只承认name, 不承认id -->
		<input type="submit" value="Test Get Method" />
	</form>
	<br />
	
	<form action="${pageContext.request.contextPath }/testPostMethod" method="post">
		<input type="text" value="Test Post Value" id="name" name="name"><!-- 注意了，前台只承认name, 不承认id -->
		<input type="submit" value="Test Post Method" />
	</form>
	<br />
	
	<form action="${pageContext.request.contextPath }/testDeleteMethod" method="post">
		<input type="text" value="Test Delete Value" id="name" name="name"><!-- 注意了，前台只承认name, 不承认id -->
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="Test Delete Method" />
	</form>
	<br />
	
	<form action="${pageContext.request.contextPath }/testPutMethod" method="post">
		<input type="text" value="Test Put Value" id="name" name="name"><!-- 注意了，前台只承认name, 不承认id -->
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="Test Put Method" />
	</form>
	<br />
</body>
</html>