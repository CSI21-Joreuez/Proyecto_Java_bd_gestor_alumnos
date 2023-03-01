<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="/utiles/cabecera.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alumno Consultado</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>



<body>
<header><%@ include file="/utiles/dashboard.jsp" %></header>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id Alumno</th>
      <th scope="col">Nombre</th>
      <th scope="col">Telefono</th>
      <th scope="col">Numero Del Portatil</th>
    </tr>
  </thead>
  <tbody>

            <!-- Mostrar el Alumno Recogido con un portatil especifico-->
            <tr>
            <td><c:out value="${miModelo.id_alumno}" /></td>
			 <td><c:out value="${miModelo.nombre}" /></td>
			 <td><c:out value="${miModelo.telefono}" /></td>
			 <td><c:out value="${miModelo.num_port}" /></td>		
		   </tr>
  </tbody>
</table>
</body>
</html>