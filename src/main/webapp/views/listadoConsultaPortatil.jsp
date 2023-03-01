<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="/utiles/cabecera.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Portatil Consultado</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>



<body>
<header><%@ include file="/utiles/dashboard.jsp" %></header>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id Portatil</th>
      <th scope="col">Marca</th>
      <th scope="col">Modelo</th>
      <th scope="col">Numero Del Alumno</th>
    </tr>
  </thead>
  <tbody>

            <!-- Mostrar el Alumno Recogido con un portatil especifico-->
            <tr>
            <td><c:out value="${miModelo.id_portatil}" /></td>
			 <td><c:out value="${miModelo.marca}" /></td>
			 <td><c:out value="${miModelo.modelo}" /></td>
			 <td><c:out value="${miModelo.id_alumno}" /></td>		
		   </tr>
  </tbody>
</table>
</body>
</html>