<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="icon" href="#">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
            crossorigin="anonymous" defer></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" defer></script>
</head>

<body>
<form action="/login" method="post">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="로그인"> <input
                    type="reset" value="취소">
                <a href="/join">회원가입</a>
                <a href="/update">비밀번호 변경</a> 
                </td>
               
        </tr>
    </table> 
</form>
</body>

</html>