<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>write_check</title>
		<c:choose>
			<c:when test="${flag == '-1'}">
				<script type="text/javascript">
					alert('오류로 인해 저장이 되지 않았습니다. 다시 입력해주세요.');
				</script>
				<c:redirect url="/write_view.do"/>
			</c:when>
			<c:otherwise>
				<script type="text/javascript">
					alert('작성이 완료되었습니다.');
				</script>
				<c:redirect url="list.do?page=${page}"/>
			</c:otherwise>
		</c:choose>
	</head>
	<body>
	
	</body>
</html>