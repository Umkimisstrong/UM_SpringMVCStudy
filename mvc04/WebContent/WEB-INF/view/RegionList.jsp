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
<title>RegionList.jsp</title>
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
			
			$(location).attr("href", "regionupdateform.action?regionId=" + $(this).val());
		});
		
		
		// 삭제 버튼 클릭 시 액션
		$(".deleteBtn").click(function()
		{
			//alert("삭제 버튼 클릭");
			
			if (confirm("현재 선택한 데이터를 정말 삭제하시겠습니까?"))
			{
				$(location).attr("href", "regiondelete.action?regionId=" + $(this).val());
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
		<h1>[ 지역 관리 (관리자 전용) ]</h1>
		<hr />
		
		<div>
			<form action="">
				<input type="button" value="지역 추가" class="btn"
				onclick="location.href='regioninsertform.action'"/>
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
			<th>지역번호</th>
			<th>지역명</th>
			<th>삭제가능여부</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	
	<c:forEach	var="region" items="${regionList }">
	<tr>
		<td>${region.regionId }</td>
		<td>${region.regionName }</td>
		<td>${region.delCheck==0 ? "삭제가능" : "삭제불가" }</td>
		<td>
			<button type="button" class="btn updateBtn"
		    value="${region.regionId }&regionName=${region.regionName}">수정</button>
		</td>
		    
		<td>
			<c:choose>
				<c:when test="${region.delCheck!=0 }">
				<button type="button" class="btn deleteBtn"
				value="${region.regionId }&delCheck=${region.delCheck}" disabled="disabled">삭제</button>	
				</c:when>
				<c:otherwise>
				<button type="button" class="btn deleteBtn"
				value="${region.regionId }" >삭제</button>
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