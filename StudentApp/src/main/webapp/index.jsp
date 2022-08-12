<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="register">


Enter Name<input type="text" name="username"><br> 
Enter stdid<input type="text" name="studentId"><br>
Enter city<input type="text" name="city"><br>  

Enter language<select name="language">
<option value="select">select</option>
<option value="java">java</option>
<option value="jsp">jsp</option>
<option value="spring">spring</option>
<option value="hibernate">hibernate</option>
</select>

 Enter hobby<input type="checkbox" value="music" name="hobby">Music
 <input type="checkbox" value="dance" name="hobby">dance
 <input type="checkbox" value="music" name="hobby">Music 
<input type="checkbox" value="sports" name="hobby">sports
<input type="checkbox" value="reading" name="hobby">Reading

<input type="submit" value="Add"><br>
 </form>
</body>
</html>