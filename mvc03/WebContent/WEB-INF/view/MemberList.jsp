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
<title>MemberList.jsp</title>
<<<<<<< HEAD
<link rel="stylesheet" href="css/main.css" type="text/css">
<style type="text/css">
	*{line-height: 150%;}
	#customers td {text-align: center;}
	#submitBtn 
=======
<link rel="stylesheet" type="text/css" href="css/main.css">
<style type="text/css">
	*{line-height: 150%;}
	#cusotmers td{text-align: center;}
	#submitBtn
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	{
		height: 150%;
		width: 250px;
		font-size: 18px;
		font-weight: bold;
<<<<<<< HEAD
		font-family: 맑은 고딕;
		color: #343;
		
=======
		font-family: 나눔고딕코딩;
		color: #343;
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	}
	#err
	{
		color: red;
		font-size: small;
		display: none;
	}
<<<<<<< HEAD

</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js" ></script>

<script type="text/javascript">
	
	$(document).ready(function()
	{
		$("#submitBtn").click(function()
		{
			$("#err").css("display", "none");
			
			//alert("gfd");
			if ($("#name").val()=="" || $("#telephone").val()=="")
			{
=======
</style>

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(function()
	{
		$("#submitBtn").click(function()
		{
			alert("회원 추가 시작");
			
			$("#err").css("display", "none");
			
			if ($("#name").val() == "" || $("#tel").val() == "")
			{
				alert("회원 추가 중");
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
				$("#err").css("display", "inline");
				return;
			}
			
<<<<<<< HEAD
			$("#memberForm").submit(); 
			
			
		})
	})

</script>



=======
			$("#memberForm").submit();
			
		});
	});
</script>
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
</head>
<body>

<div>
	<h1>회원 관리</h1>
	<hr />
</div>

<div>
	<form action="memberinsert.do" method="post" id="memberForm">
<<<<<<< HEAD
		이름 <input type="text" name="name" id="name" class="control" required="required"/>
		<br />
		전화 <input type="text" name="telephone" id="telephone" class="control" required="required"/>
		<br />
		<button type="button" id="submitBtn" onclick="">회원 추가</button>
		<span id="err">모든 항목을 입력해야 합니다.</span>
	</form>
	<br />
	<!-- EL 표현에 의한 인원수 출력 부분 -->
	<p>전체 인원 수 : ${count }</p>
	
	<table id="customers" style="width: 500px;">
		<tr>
			<th>번호</th><th>이름</th><th>전화</th>
		</tr>
		
		<c:forEach var="dto" items="${memberList }">
		<tr>
			<td>${dto.mid }</td>
			<td>${dto.name }</td>
			<td>${dto.telephone }</td>
		</tr>
		</c:forEach>
		
	</table>
</div>

=======
		이름 <input type="text" id="name" required="required" name="name" class="control" />
		<br />
		전화 <input type="text" id="tel" name="tel" class="control" required="required"/>
		<br />
		<button type="button" id="submitBtn">회원 추가</button><br />
		<span id="err">모든 항목을 입력해야 합니다.</span>
	</form>
	
	<br />
	<!-- EL 표현에 의한 인원 수 출력 부분 -->
	<p>전체 인원 수 : ${count }</p>
	<table id="cusotmers" style="width: 500px;">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
		</tr>
		
		<!-- EL,JSTL 표현에 의한 회원 명단 출력 부분 -->
		<c:forEach var="member" items="${memberList }">
		<tr>
			<!-- MemberDTO 객체의 getMid(), getName(), getTel() 메소드를 호출하는 EL 표현 -->
			<td>${member.mid }</td>
			<td>${member.name }</td>
			<td>${member.tel }</td>
		</tr>
		</c:forEach>
	
	</table>
</div>






>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
</body>
</html>