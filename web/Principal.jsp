<%-- 
    Document   : Principal
    Created on : 18/10/2020, 11:23:21 AM
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Auto Partes Principal</title>
       
        <link rel="stylesheet" type="text/css" href="Css/Estilos.css" media="screen" />
        
    </head>
    <body>
        <img src="Imagenes/Imagen2.jpg" alt="fondop" id="dg"/>
        <nav class="navbar navbar-expanad-lg navbar-dark bg-dark">
            
          <div class="dropdown">
                <a  style="color: #ffffff"class="navbar-toggler" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown"><span class="navbar-toggler-icon"></span> Inicio</a>
                <div  class="dropdown-menu text-center">
                    <a  href="Principal.jsp" class="dropdown-item">Inicio</a>
                    <a  href="Cliente.jsp" class="dropdown-item">Cliente</a>
                    <a  href="Cliente.jsp" class="dropdown-item">Producto</a>
                    <a  href="Cliente.jsp" class="dropdown-item">Compra</a>
                    <a  href="Cliente.jsp" class="dropdown-item">Ingesar Cliente</a>
                    
                </div>    
            </div>
           
            
            <div class="dropdown">
                <a  style="color: #ffffff"href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar cesión   </a>
                <div class="dropdown-menu text-center">
                    <a><img src="Imagenes/usuario.jpg" height="80" width="80"</a>
                    <a>User</a>
                    <div class="dropdown-divider"></div>
                    <a  href="index.jsp" class="dropdown-item">Salir</a>
                    
                </div>
                    
            </div>
        </nav>
        <div class="container mt-4">
            <h1 style="color: #ffffff">Bienvenido.......<strong>Usuario:</strong></h1>
        </div>
        
       <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>      
    </body>
</html>
