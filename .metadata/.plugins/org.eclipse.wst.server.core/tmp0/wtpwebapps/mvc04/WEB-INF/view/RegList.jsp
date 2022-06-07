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
<title>RegList.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/menuStyle.css">
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/main.css">


</head>
<body>

<!--------------------------------------------------- 
	RegList.jsp
	- 지역 리스트 출력 페이지
	- 일반직원이 접근하는 지역 데이터 출력 페이지
	  (관리자가 접근하는 지역 데이터 출력페이지는
	   RegionList.jsp로 구성)
	- 입력 / 수정 / 삭제 기능 없음   
 ---------------------------------------------------->
 
 
<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
		<h1>[ 지역 목록 (일반직원 전용) ]</h1>
		<hr />
		
		<!-- 제거된 div -> 직원 추가 폼
		<div>
			<form action="">
				<input type="button" value="직원 추가" class="btn"
				onclick="location.href='employeeinsertform.action'"/>
				  onclick="location.href='EmployeeInsertForm.jsp'"/>
				  
			</form>
		</div>
		-->
		<br />
		<br />
	<!-- ---------------------------------------------------	
	DEPARTMENTID, DEPARTMENTNAME, DELCHECK
	----------------------------------------------------  -->
	<table id="customers" class="table">
  
		<tr>
			<th>지역번호</th>
			<th>지역명</th>
		</tr>
	<!--
		<tr>
			<td>1</td>
			<td>김상기</td>

			<td>서울</td>
			<td>개발부</td>
			<td>사원</td>
			<td>관리자</td>
		</tr>
		<tr>
			<td>2</td>
			<td>이상기</td>
			<td>서울</td>
			<td>개발부</td>
			<td>사원</td>
			<td>관리자</td>
		</tr>
		<tr>
			<td>3</td>
			<td>박상기</td>
			<td>서울</td>
			<td>개발부</td>
			<td>사원</td>
			<td>관리자</td>
		</tr> -->
		
		
	<c:forEach	var="region" items="${regionList }">
	<tr>
		<td>${region.regionId }</td>
		<td>${region.regionName }</td>
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