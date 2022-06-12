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
<title>GradeList.jsp</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<!-- CSS only -->

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(function()
	{
		$(".btn-danger").click(function()
		{
			var sid = $(this).val();
			var result = confirm(sid + "번 학생 성적을 정말로 삭제하시겠습니까?");
			
			if (result)
			{
				// 삭제
				location.href="gradedelete.action?sid="+sid;
			}
			else
			{
				alert("취소하였습니다.");
				return;
			}
		
		});
	});
	

</script>


</head>
<body>

<div class="panel title">
	<h1>성적 관리(SpringMVC + Annotation + mybatis 버전)</h1>
</div>

<!-- 메인 메뉴 영역 -->
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="#" class="navbar-brand">Home</a>
		</div>
		
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active">
					<a href="studentlist.action">학생 관리 <span class="sr-only">(current)</span></a>
				</li>
				<li>
					<a href="gradelist.action">성적 관리</a>
				</li>
			</ul>
		</div>
		
		
	</div>
</nav>

<div class="container">
	<div class="panel-group">
		<div class="panel panel_default">
			<div class="panel-heading row">
				<span style="font-size: 17pt; font-weight: bold;" class="col-md-3">
					성적 리스트 출력
				</span>			
				<span class="col-md-9">
					<a href="gradeinsertform.action" role="button"
					class="btn btn-success btn-xs" id="btnAdd"
					style="vertical-align: bottom;">성적 추가</a>
				</span>
			</div>
			
			 
			<div class="panel-body">
				입력된 학생 성적 수 <span class="badge">${count }</span>
			</div>
			 
 					 
			<div class="panel-body">
				<table class="table table-hover table-striped">
					<thead>
						<tr class="trTitle">
							<th>번호</th>
							<th>이름</th>
							<th>과목1</th>
							<th>과목2</th>
							<th>과목3</th>
							<th>총점</th>
							<th>평균</th>
							<th>합격여부</th>
							<th>수정 및 삭제</th>
						</tr>
					</thead>
					
				<tbody>
				<!-- 
					<tr>
						<td>1</td>
						<td>이호석</td>
						<td>010-1111-1111</td>
						<td>0</td>
						<td>
							<button type="button" class="btn btn-success">수정</button>
							<button type="button" class="btn btn-danger">삭제</button>
						</td>
					</tr>
					<tr>
						<td>2</td>
						<td>한충희</td>
						<td>010-2222-2222</td>
						<td>0</td>
						<td>
							<button type="button" class="btn btn-success">수정</button>
							<button type="button" class="btn btn-danger">삭제</button>
						</td>
					</tr>
					<tr>
						<td>3</td>
						<td>임소민</td>
						<td>010-3333-3333</td>
						<td>1</td>
						<td>
							<button type="button" class="btn btn-success">수정</button>
							<button type="button" class="btn btn-danger">삭제</button>
						</td>
					</tr>
				 -->	
					<c:forEach var="grade" items="${list }">
						<tr>
							<td>${grade.sid }</td>
							<td>${grade.name }</td>
							<td>${grade.sub1 }</td>
							<td>${grade.sub2 }</td>
							<td>${grade.sub3 }</td>
							<td>${grade.tot }</td>
							<td>${grade.avg }</td>
							<td>${grade.ch }</td>
							<td>
								<button type="button" class="btn btn-success" value="${grade.sid }">수정</button>
								<button type="button" class="btn btn-danger" value="${grade.sid }">삭제</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
				</table>
				

			</div>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		</div>
	</div>
</div>
</body>
</html>