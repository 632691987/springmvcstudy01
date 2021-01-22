<html>
<head>
    <title>JSP Include example with parameters</title>
</head>
<body>
<h2>This is index.jsp Page</h2>
<jsp:include page="testjspinclude2.jsp">
    <jsp:param name="userid" value="Chaitanya" />
    <jsp:param name="password" value="Chaitanya" />
    <jsp:param name="name" value="Chaitanya Pratap Singh" />
    <jsp:param name="age" value="27" />
</jsp:include>
</body>
</html>