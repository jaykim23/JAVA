<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쟈뎅INDEX</title>
	</head>
	<body>
		<ul>
		<c:choose>
			<c:when test="${session_flag == null || session_flag=='fail'}">
				<h3>로그인이 되어 있지 않습니다.</h3>
				<li><a href="login">로그인</a></li>
			</c:when>		
			<c:otherwise>
				<h3>${session_nName} 님을 환영합니다!</h3>
				<li><a href="list.do">게시판페이지</a></li>
				<li><a href="logout.jsp">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
		</ul>
	</body>
</html>