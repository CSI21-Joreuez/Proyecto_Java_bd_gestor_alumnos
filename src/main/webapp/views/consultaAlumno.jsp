<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta Alumno</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
<header><%@ include file="/utiles/dashboard.jsp" %></header>

<form method="post" action="consultaAlumno">
        <div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Consulta Alumno</div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Id del Portatil a Buscar</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input type="number" class="form-control" name="num_port" placeholder="1...2...3..." required>
                </div>
            </div>
            
            
			<br /><br />
			
            <div class="form-group row">
                <label class="col-sm-4 col-form-label"></label>
                <div class="col-sm-4">
                    <button type="submit" class="button btn btn-primary">Buscar</button>                    
                </div>
            </div>

            
        </div>
    </form>
</body>
</html>