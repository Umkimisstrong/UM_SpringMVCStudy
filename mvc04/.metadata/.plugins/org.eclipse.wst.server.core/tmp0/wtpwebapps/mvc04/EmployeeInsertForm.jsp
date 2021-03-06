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
<title>EmployeeInsertForm.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=cp %>/css/main.css">
</head>
<body>

<!-- --------------------------
	#20 EmployeeInsertForm.jsp
	- 직원 데이터 입력 페이지 
-------------------------- -->

<div>
	<!-- 메뉴 영역 -->
	<div>
		<c:import url="EmployeeMenu.jsp"></c:import>
	</div>
	
	<!-- 콘텐츠 영역 -->
	<div id="content">
		<h1>[ 직원 추가 ]</h1>
		<hr />
		
		<form action="" method="post" id="employeeForm">
			<table>
				<tr>
					<th>이름</th>
					<td>
						<input type="text" id="name" name="name" placeholder="이름"/>
					</td>
				</tr>
				<tr>
					<th>주민번호</th>
					<td>
						<input type="text" id="ssn1" name="ssn1" style="width: 100px;"
						placeholder="앞 6자리"/>
						-
						<input type="password" id="ssn2" name="ssn2" style="width: 110px"
						placeholder="뒤 7자리" />
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>
						<input type="text" id="birthday" name="birthday" placeholder="생년월일" />
					</td>
				</tr>
				<tr>
					<th>양/음력</th>
					<td>
						<input type="radio" value="0" name="lunar" id="lunar0" checked="checked"/>
						<label for="lunar0">양력</label>
						<input type="radio" value="1" name="lunar" id="lunar1" />
						<label for="lunar1">음력</label>
					</td>
				</tr>
				
				<tr>
					<th>전화번호</th>
					<td>
						<input type="text" id="telephone" name="telephone" placeholder="전화번호" />
					</td>
				</tr>
				
				<tr>
					<th>지역</th>
					<td>
						<select name="regionId" id="regionId">
							<option value="1">강북</option>
							<option value="2">강남</option>
							<option value="3">마포</option>
							<option value="4">서대문</option>
							<option value="5">은평</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<th>부서</th>
					<td>
						<select name="departmentId" id="departmentId">
							<option value="1">독서부</option>
							<option value="2">원예부</option>
							<option value="3">축구부</option>
							<option value="4">야구부</option>
						</select>
					</td>			
				</tr>
				
				<tr>
					<th>직위</th>
					<td>
						<select name="positionId" id="positionId">
							<option value="1">팀장</option>
							<option value="2">기술고문</option>
							<option value="3">팀원</option>
							<option value="4">엑스맨</option>
						</select>
					</td>			
				
				</tr>
				
				<tr>
					<th>기본급</th>
					<td>
						<input type="text" id="basicPay" name="basicPay">
						(최소기본급 <span id="minBasicPay"
						style="color: red; font-weight: bold">2000000</span>원)
					</td>
				</tr>
				
				<tr>
					<th>수당</th>
					<td>
						<input type="text" id="extraPay" name="extraPay"/>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<br /><br />
						<button type="button" class="btn" id="submitBtn"
						style="width: 40%; height: 50px;">직원 추가</button>
						<button type="button" class="btn" id="listBtn"
						style="width: 40%; height: 50px;">직원 리스트</button>
						<br /><br />
						
						<span id="err" style="color: red; font-weight: bold; display: none;"></span>
					</td>
				</tr>
				
			</table>
		</form>
	</div>
	
	
	<!-- 회사 소개 및 어플리케이션 소개 영역 -->
	<div id="footer">
	</div>
	
	
</div>


</body>
</html>