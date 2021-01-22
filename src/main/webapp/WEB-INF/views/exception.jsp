<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exception Page</title>
</head>
<body>
  <h1>Error Page</h1>
  <p>Application has encountered an error. Please contact support on ...</p>
    Failed URL: ${url}<br />
    Exception:  ${exception.message} <br />
</body>
</html>