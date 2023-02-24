<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Matricula Alumno</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>

<body>

<form method="post" action="matriculaAlumno">
        <div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Matrícula Alumno</div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Nombre</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="nombre" placeholder="Juan" required>
                </div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Teléfono</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="tlf" placeholder="+34 654768112" required>
                </div>
                
            </div>
            
            
             <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Marca</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="marca" placeholder="Acer" required>
                </div>
                
            </div>
            
                        <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Modelo</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="modelo" placeholder="Race Master" required>
                </div>
                
            </div>
                        <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Numero Portatil</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="num_port" placeholder="1...2...3" required>
                </div>
                
            </div>
            
            
			<br /><br />
			
            <div class="form-group row">
                <label class="col-sm-4 col-form-label"></label>
                <div class="col-sm-4">
                    <button type="submit" class="button btn btn-primary">Registrar</button>                    
                </div>
            </div>

            
        </div>
    </form>

</body>
</html>





