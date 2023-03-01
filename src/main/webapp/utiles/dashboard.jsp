<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Gestión Material Alumno</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Alta Alumno" onclick="window.location.href='redirectMatriculaAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Alta Portatil" onclick="window.location.href='redirectAddPortatil'"/>
      </li>
            <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Baja Alumno" onclick="window.location.href='redirectBorradoAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Consulta Portatil" onclick="window.location.href='redirectConsultaPortatil'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Consulta Un Alumno" onclick="window.location.href='redirectConsultaAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Listado de Alumnos" onclick="window.location.href='listadoAlumno'"/>
      </li>
    </ul>
  </div>
</nav>








</body>
</html>