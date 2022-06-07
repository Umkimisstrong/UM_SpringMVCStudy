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
<link rel="stylesheet" type="text/css" href="css/main.css">
<style type="text/css">
	*{line-height: 150%;}
	#cusotmers td{text-align: center;}
	#submitBtn
	{
		height: 150%;
		width: 250px;
		font-size: 18px;
		font-weight: bold;
		font-family: 나눔고딕코딩;
		color: #343;
	}
	#err
	{
		color: red;
		font-size: small;
		display: none;
	}
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
				$("#err").css("display", "inline");
				return;
			}
			
			$("#memberForm").submit();
			
		});
	});
</script>
</head>
<body>

<div>
	<h1>회원 관리</h1>
	<hr />
</div>

<div>
	<form action="memberinsert.do" method="post" id="memberForm">
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






</body>
</html>