<%-- 
    Document   : Ingesar_Producto
    Created on : 25/10/2020, 04:01:35 PM
    Author     : Francisco Back
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
        <div class="card col-sm-3">
            <div class="card-body">
                <form action="ControladorPrincipal?menu=Ingesar_Producto" method="POST">
                    <div class="from-group"><label></label><input type="text" value="${produc.getNombreParte()}" name="txtNombreParte" class="form-control"  placeholder="NombreParte"> </div>
                    <div class="from-group"><label></label><input type="text" value="${produc.getCodigo()}"  name="txtCodigo" class="form-control"placeholder="Codigo" > </div>
                    <div class="from-group"><label></label><input type="text" value="${produc.getMarca()}"  name="txtMarca" class="form-control"placeholder="Marca"> </div>
                    <div class="from-group"><label></label><input type="text" value="${produc.getFuncion()}"  name="txtFuncion" class="form-control"placeholder="Funcion"> </div>
                    <div class="from-group"><label></label><input type="text" value="${produc.getprecio()}"   name="txtprecio" class="form-control"placeholder="precio"> </div>
                    <div class="from-group"><label></label><input type="text"  value="${produc.getExistencia()}" name="txtExistencia" class="form-control"placeholder="Existencia"> </div>
                   
                    <br>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                   
                </form>
                
            </div>
        </div>
            <div class="col-sm-8">
            <table class="table table-hover table table-striped" >
                <thead  class="thead-dark">
                <r>
                     <th>IdProducto</th>
                    <th>NombreParte</th>
                    <th>Codigo</th>
                    <th>Marca</th>
                    <th>Funcion</th>
                    <th>Precio</th>
                    <th>Existencia</th> 
                    <th>Acciones</th>
                </r>
                </thead>
                <tbody>
                    
                <c:forEach var="pro" items="${producto}">
                >>>
                    <tr>
                        <td>${pro.getIdProducto()}</td>
                        <td>${pro.getNombreParte()}</td>
                        <td>${pro.getCodigo()}</td>
                        <td>${pro.getMarca()}</td>
                        <td>${pro.getFuncion()}</td>
                        <td>Q${pro.getPrecio()}</td>
                        <td>${pro.getExistencia()}</td>
                        <td> 
                            <a class="btn btn-primary" href="ControladorPrincipal?menu=Ingesar_Producto&accion=Editar&IdC=${pro.getIdProducto()}">Editar</a>
                            <a class="btn btn-warning" href="ControladorPrincipal?menu=Ingesar_Producto&accion=Eliminar&IdC=${pro.getIdProducto()}">Eliminar</a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
            </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>      
    </body>
</html>
