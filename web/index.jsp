<%-- 
    Document   : index
    Created on : 12/10/2020, 10:53:08 PM
    Author     : Francisco Back
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Partes</title>
        <link rel="stylesheet" type="text/css" href="Css/Estilos.css" media="screen" />
    </head>
    <body >
        <img  src="Imagenes/29490_1920_1200.jpg" alt="Fondo" id="dg"/>

        <!-- Ingreso imagen logo -->
        <img src="Imagenes/LogoEmpresa.png" alt="Panel" id="Logo"/>.
        <div class="box">

            <!-- ingreso de mensaje -->
            <h1>Login Here</h1>
            <form  action="Controlador">
                <!-- creando Usuario -->
                <label for="Nombre Usuario"> Usuario </label>
                <input type="text" placeholder="Usuario" name="txtUser"/> 
                <!-- creando Password -->
                <label for="Password"> Contraseña </label>
                <input type="Password" placeholder="Password" name="txtpassword"/>
                <!-- Boton -->
                <input  type="submit" value="Login" name="accion">
                <!-- enlase -->
                <a href="#">Recuperacion de Contraseña</a>
                <%
               
               

                %>
            </form>
        </div>


    </body>


</html>
