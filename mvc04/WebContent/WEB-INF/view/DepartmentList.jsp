<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DepartmentList.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/menuStyle.css">
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/main.css">
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">

	$(function()
	{
		// 테스트
		//alert("확인");
		
		// 수정 버튼 클릭 시 액션
		$(".updateBtn").click(function()
		{
			//alert("수정 버튼 클릭");
			
			$(location).attr("href", "departmentupdateform.action?departmentId=" + $(this).val());
		});
		
		
		// 삭제 버튼 클릭 시 액션
		$(".deleteBtn").click(function()
		{
			//alert("삭제 버튼 클릭");
			
			if (confirm("현재 선택한 데이터를 정말 삭제하시겠습니까?"))
			{
				$(location).attr("href", "departmentdelete.action?departmentId=" + $(this).val());
				// $(location).attr(속성, URL?데이터=값);
			}
		});
	});
	
	
</script>

</head>
<body>

<!--------------------------------------------------- 
		 RegioniList.jsp
	- 지역 리스트 출력 페이지
	- 관리자가 접근하는 지역 데이터 출력 페이지
	  (일반 직원이 접근하는 직원 데이터 출력페이지는
	   RegList.jsp로 구성)
 ---------------------------------------------------->
 
 
<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
		<h1>[ 부서 관리 (관리자 전용) ]</h1>
		<hr />
		
		<div>
			<form action="">
				<input type="button" value="부서 추가" class="btn"
				onclick="location.href='departmentinsertform.action'"/>
				  <!-- onclick="location.href='EmployeeInsertForm.jsp'"/> -->
				  
			</form>
		</div>
		<br />
		<br />
	<!-- ---------------------------------------------------	
	EMPLOYEEID NAME SSN BIRTHDAY LUNAR LUNARNAME TELEPHONE
	DEPARTMENTID DEPARTMENTNAME POSITIONID POSITIONNAME 
	REGIONID REGIONNAME BASICPAY EXTRAPAY PAY GRADE
	----------------------------------------------------  -->
	<table id="customers" class="table">
	 
		<tr>
			<!-- 항목 15EA -->
			<th>부서번호</th>
			<th>부서명</th>
			<th>삭제가능여부</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	
	<c:forEach	var="department" items="${departmentList }">
	<tr>
		<td>${department.departmentId }</td>
		<td>${department.departmentName }</td>
		<td>${department.delCheck==0 ? "삭제가능" : "삭제불가" }</td>
		<td>
			<button type="button" class="btn updateBtn"
		    value="${department.departmentId }&departmentName=${department.departmentName}">수정</button>
		</td>
		    
		<td>
			<c:choose>
				<c:when test="${department.delCheck!=0 }">
				<button type="button" class="btn deleteBtn"
				value="${department.departmentId }&delCheck=${department.delCheck}" disabled="disabled">삭제</button>	
				</c:when>
				<c:otherwise>
				<button type="button" class="btn deleteBtn"
				value="${department.departmentId }" >삭제</button>
				</c:otherwise>
			</c:choose>
			
		</td>
	</tr>
	</c:forEach>	
		
	</table>
	
	
	
	</div>
	
	<!-- 회사 소개 및 어플리케이션 소개 영역 -->
	<div id="footer">
	
	</div>
	
</div>





</body>
</html>