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
out.print("have a great day");
%>
<%!String name="ram";%>
<%= ("welcome"+name)%>
<% int x =10,y=20; %>
<%="sum"+(x+y) %>
<%= "have a great day" %>

<%! int count=0;%>
you are visitor number<%=count++ %>

<%! int counter=0 ; %>
You are visitor no;<%=++counter %>

</body>
</html>