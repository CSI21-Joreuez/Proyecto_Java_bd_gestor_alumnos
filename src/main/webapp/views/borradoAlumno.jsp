<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrado De Alumno</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
<header><%@ include file="/utiles/dashboard.jsp" %></header>

<form method="post" action="borradoAlumno">
        <div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Borrado De Alumno</div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Id del Alumno a Eliminar</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input type="number" class="form-control" name="num_port" placeholder="1...2...3..." required>
                </div>
            </div>
            
                        <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Confirmación de Borrado</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="conf" placeholder="Escribe 'si' para confirmar" required>
                </div>
            </div>
            
            
			<br /><br />
			
            <div class="form-group row">
                <label class="col-sm-4 col-form-label"></label>
                <div class="col-sm-4">
                    <input type="submit" class="button btn btn-danger" value="Borrar"></input>                    
                </div>
            </div>

            
        </div>
    </form>
</body>
</html>