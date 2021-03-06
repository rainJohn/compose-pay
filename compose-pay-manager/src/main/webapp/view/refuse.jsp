<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>

<jsp:include page="_set.jsp"/>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title><c:out value="${_title}"/></title>
    <jsp:include page="_import.jsp"/>
</head>

<body class="gray-bg">

    <div class="middle-box text-center animated fadeInDown">
        <h1>No!</h1>
        <h3 class="font-bold">权限不足！</h3>

        <div class="error-desc">
            	抱歉，你没有权限哦~
        </div>
    </div>

</body>

</html>