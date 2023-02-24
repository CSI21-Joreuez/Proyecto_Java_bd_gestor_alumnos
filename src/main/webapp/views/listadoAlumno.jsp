<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/views/cabecera.jsp" %>
    
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

            <!-- Iterar sobre la lista de alumnos -->
			<c:forEach var="alumno" items="${ListaAlumnos}">
				<tr>
					<td><c:out value="${alumno.nombre}" /></td>
					<td><c:out value="${alumno.telefono}" /></td>
					<td><c:out value="${alumno.num_port}" /></td>
				</tr>
			</c:forEach>
  </tbody>
</table>
</body>
</html>