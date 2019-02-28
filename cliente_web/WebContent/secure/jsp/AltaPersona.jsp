<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!------ Include the above in your HEAD tag ---------->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script type="text/javascript" src="<%=request.getContextPath()%>/nonsecure/static/js/Alert.js"></script>

<title>Alta empleados</title>
</head>
<body>

<jsp:include page="includes/Menu.jsp" />
<div class="container">
	
    <c:if test="${status == 'success'}">
    <div class="row">    
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <div class="alert alert-success">
                <p>La operación se ha realizado correctamente</p>
            </div>
        </div>
    </div>
    </c:if>
    
    <c:if test="${status == 'failure'}">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <div class="alert alert-danger">
                <p>${message}</p>
            </div>
        </div>
    </div>
    </c:if>      

	   <div class ="row">
	   	<div class="col-12">
	   		<h1>Alta empleados</h1>
	   	</div>
	   </div>
		<form method="post" action="<%=request.getContextPath()%>/secure/servlets/AltaPersonaServlet">
		  <div class="form-row">
		  	<h3>Datos personales</h3>
		  </div>
		  <div class="form-row">
		  	<div class="form-group col-md-6">
		      <label for="nombre">Nombre</label>
		      <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="apellido">Apellido</label>
		      <input type="text" class="form-control" id="apellido" placeholder="Apellido">
		    </div>
		    
		    <div class="form-group col-md-12">
		      <label for="inputEmail4">Email</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-12">
		      <label for="documento">Nro documento</label>
		      <input type="text" class="form-control" id="documento" placeholder="Nro documento - sin puntos">
		    </div>
		  </div>
		  
		  <div class="form-row">
		  	<h3>Dirección</h3>
		  </div>
		  <div class="form-group">
		    <label for="inputAddress">Address</label>
		    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
		  </div>
		  <div class="form-group">
		    <label for="inputAddress2">Address 2</label>
		    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
		  </div>
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputCity">City</label>
		      <input type="text" class="form-control" id="inputCity">
		    </div>
		    <div class="form-group col-md-4">
		      <label for="inputState">State</label>
		      <select id="inputState" class="form-control">
		        <option selected>Choose...</option>
		        <option>...</option>
		      </select>
		    </div>
		    <div class="form-group col-md-2">
		      <label for="inputZip">Zip</label>
		      <input type="text" class="form-control" id="inputZip">
		    </div>
		  </div>
		  <button type="submit" class="btn btn-primary" type="submit">Guardar</button>
		</form>
</div>


</body>
</html>