<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Libreta legajos</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="<%=request.getContextPath()%>/secure/servlets/HomeServlet">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Empleados
        </a>
        <div id="navbarSupportedContent" class="dropdown-menu">
          <a class="dropdown-item" href="<%=request.getContextPath()%>/secure/servlets/AltaPersonaServlet">Alta</a>
          <a class="dropdown-item" href="#">Modificación</a>
          <a class="dropdown-item" href="#">Consulta</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Baja</a>
        </div>
      </li>
    </ul>
    <ul class="navbar-nav ml-auto" style="float: right;">
     <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/secure/servlets/LogoutServlet" >
          <span class="fas fa-sign-out-alt"></span>
          Logout
        </a>
      </li>
    </ul>
  </div>
</nav>

