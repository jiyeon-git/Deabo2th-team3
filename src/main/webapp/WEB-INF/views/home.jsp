<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/layouts/header.jsp" %>
<h1>HOME</h1>

<hr>
<form method="post" action="/logout">
    <input type="submit" value="로그아웃">
</form>

<%@ include file="/WEB-INF/views/layouts/footer.jsp" %>