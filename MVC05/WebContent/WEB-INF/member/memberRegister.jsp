<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
회원가입화면
<!-- 
	서블릿 위치를 맞추기 위해 이전폴더로 가야한다. ../보다 명시적으로하자.
	즉 http://localhost:8081/MVC01/member/memberRegister.html 경로에서
	http://localhost:8081/MVC01/member/memberInsert.do 로 바뀌는데,
	서블릿은 컨텍스트 패스를 기준으로 하기 때문에 MVC01/여기에 와야한다.
	
-->             
<form action="${ctx}/memberInsert.do" method="post"> 
<table class="table table-bordered">
  <tr>
    <td>아이디</td>
    <td><input type="text" name="id"/></td>
  </tr>
  <tr>
    <td>비밀번호</td>
    <td><input type="password" name="pass"/></td>
  </tr>
  <tr>
    <td>이름</td>
    <td><input type="text" name="name"/></td>
  </tr>
  <tr>
    <td>나이</td>
    <td><input type="text" name="age"/></td>
  </tr>
  <tr>
    <td>이메일</td>
    <td><input type="text" name="email"/></td>
  </tr>
  <tr>
    <td>전화번호</td>
    <td><input type="text" name="phone"/></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
    	<input type="submit" value="가입" class="btn btn-primary"/>
    	<input type="reset" value="취소" class="btn btn-warning"/>
    </td>
  </tr>
</table>
</form>
</body>
</html>