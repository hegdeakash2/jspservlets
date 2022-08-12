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
String title=(String)request.getAttribute("mytitle");
out.print("title is"+title+"<br>");

Integer id=(Integer)request.getAttribute("bookId");
out.print("id num is"+id+"<br>");

String author=(String)request.getAttribute("author");
out.print("author is"+author+"<br>");


String category=(String)request.getAttribute("category");
out.print("category is"+category+"<br>");



double price=(Double)request.getAttribute("price");
out.print("price is"+price+"<br>");





%>
</body>
</html>