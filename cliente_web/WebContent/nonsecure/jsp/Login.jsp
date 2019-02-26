<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
<%--     <link href="<%=request.getContextPath()%>/nonsecure/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" > --%>
<%--     <link href="<%=request.getContextPath()%>/nonsecure/static/bootstrap/js/ext/datepicker/css/datepicker.min.css" rel="stylesheet" type="text/css" > --%>
<%--     <link href="<%=request.getContextPath()%>/nonsecure/static/css/layout.css" rel="stylesheet" type="text/css" > --%>
<%--     <script type="text/javascript" src="<%=request.getContextPath() %>/nonsecure/static/bootstrap/js/ext/jquery.min.js"></script> --%>
<%--     <script type="text/javascript" src="<%=request.getContextPath()%>/nonsecure/static/bootstrap/js/bootstrap.min.js"></script> --%>
<%--     <script type="text/javascript" src="<%=request.getContextPath()%>/nonsecure/static/js/Alert.js"></script> --%>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="<%=request.getContextPath()%>/nonsecure/static/css/Login.css" rel="stylesheet" type="text/css" >
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/nonsecure/static/js/Alert.js"></script>
<title>Libreta legajos</title>
</head>
<body>
  <div class="container">
    <div class="row">
    
    <c:if test="${status == 'failure'}">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <div class="alert alert-danger">
                <p>${message}</p>
            </div>
        </div>
    </div>
    </c:if>    
    
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form name="loginForm" class="form-signin" method="post" action="<%=request.getContextPath()%>/nonsecure/servlets/LoginServlet">
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="usuario" required autofocus>
                <label for="inputEmail">Email address</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
                <label for="inputPassword">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> Sign in with Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> Sign in with Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>