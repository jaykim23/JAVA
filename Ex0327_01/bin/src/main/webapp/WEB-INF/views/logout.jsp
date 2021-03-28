<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			alert('로그아웃 되었습니다. 다음에 또 방문해주세요!');
			location.href="index.jsp";
			
		</script>
	</head>
	<body>
		
	</body>
</html>