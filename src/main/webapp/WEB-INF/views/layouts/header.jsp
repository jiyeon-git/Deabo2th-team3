<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:if test='${pageContext.request.getParameter("redirect") eq "true"}'>
    <c:redirect url="${path}"/>
</c:if>

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Spring Legacy">
    <meta name="author" content="Annotation">
    <title>Annotation</title>
    <link rel="icon" href="#">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WEB-INF/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WEB-INF/static/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/static/js/bootstrap.min.js" defer></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/static/js/bootstrap.min.js" defer></script>
</head>

<body>
    <%
        request.setCharacterEncoding("UTF-8");

        Map<String, String[]> map = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            System.out.printf("%s : %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    %>

<header class="foodmaster">FOOD MASTER
    <a href="/auth/logout"><img class="logout" src="#"></a>
    <a href="/update">비밀번호 변경</a> 
</header>
