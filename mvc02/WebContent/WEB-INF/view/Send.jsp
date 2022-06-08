<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send.jsp</title>
<<<<<<< HEAD
<link rel="stylesheet" href="css/main.css" type="text/css">
=======
<link rel="stylesheet" type="text/css" href="css/main.css">
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
</head>
<body>

<div>
	<h1>Spring MVC 데이터 송수신 실습</h1>
	<hr />
</div>

<div>
	<form action="receive.do" method="post">
		이름 <input type="text" name="userName" />
<<<<<<< HEAD
		<button type="submit">submit</button>	
=======
		<button type="submit">submit</button>
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	</form>
</div>

</body>
</html>