<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>RequestMappingHandlerMapping</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery.json.js"></script>
</head>
<body>
<!-- 
配合@ResponseBody注解，以及HTTP Request Header中的Accept属性，
Controller返回的Java对象可以自动被转换成对应的XML或者JSON数据。
 -->
<a href="${pageContext.request.contextPath }/testResponseBody/employees/chole">test with pure link</a><br /><br />
<input id="xmlbutton" type="button" value="test with AJAX(xml)" /><br /><br />
<input id="jsonbutton" type="button" value="test with AJAX(json)" /><br /><br />

<script type="text/javascript">
$("#xmlbutton").click(function(){
    $.ajax(
    		{
    			url: "${pageContext.request.contextPath }/testResponseBody/employees/chole", 
    			dataType:"XML",
    			success: function(result){
    				$(result).find("employeeDTO").each(
    						function(data){
    							var name = $(this).children("name").text();
    							var salary = $(this).children("salary").text();
    							alert("name=" + name + "\nsalary=" + salary);
    						}
    				);
    			}
    		}
    );
});

$("#jsonbutton").click(
		function(){
			$.ajax({
				url: "${pageContext.request.contextPath }/testResponseBody/employees/chole",
				dataType:"JSON",
				success: function(result){
					var data=$.toJSON(result);//由于result 并非一个正确的JSON格式，因此需要一个插件去兼容(jquery.json.js)
					var obj = jQuery.parseJSON(data);
					alert("name=" + obj.name + "\nsalary=" + obj.salary);
				}
			});
		}
);
</script>
</body>
</html>