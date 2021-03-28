<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Reply_check</title>
		<c:choose>
				<c:when test="${flag == -1}">
					<script type="text/javascript">
						alert('오류로 인해 답글작성에 실패했습니다. 입력사항을 다시 확인해주세요.');
					</script>
					<c:redirect url="reply_view.do"/>
				</c:when>
				<c:otherwise>
					<script type="text/javascript">
						alert('답글이 성공적으로 작성되었습니다.');
					</script>
					<c:redirect url="list.do?page=${page}"/>
				</c:otherwise>
		</c:choose>
	</head>
	<body>
		
	</body>
</html>