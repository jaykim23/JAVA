<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Modify_check</title>
	</head>
	<body>
		<c:choose>
				<c:when test="${chk == -1}">
					<script type="text/javascript">
						alert('오류로 인해 수정이 되지 않았습니다. 다시 입력해주세요.');
					</script>
					<c:redirect url="modify_view.do"/>
				</c:when>
				<c:otherwise>
					<script type="text/javascript">
						alert('수정이 완료되었습니다.');
					</script>
					<c:redirect url="content_view.do?page=${page}&bId=${bId}"/>
				</c:otherwise>
		</c:choose>
	</body>
</html>