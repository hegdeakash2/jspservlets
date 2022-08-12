<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)request.getAttribute("username");
out.print("name is"+name+"<br>");
%>
<form action="movieServlet">
enter choice<select name="language">
<option value="language">select</option>
<option value="kannada">kannada</option>
<option value="hindi">hindi</option>
<option value="english">english</option>
<input type="submit" value="add"><br>


</form>







</select>













</body>
</html>