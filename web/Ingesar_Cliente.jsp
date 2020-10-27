<%-- 
    Document   : Ingesar_Cliente
    Created on : 25/10/2020, 04:01:20 PM
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
        <div class="card col-sm-6">
            <div class="card-body">
                <form action="ControladorPrincipal?menu=Ingesar_Cliente" method="POST">
                    <div class="form-group"> <label>Contacto</label><input type="text" name="txtContacto" class="form-control"> </div>
                    <div class="form-group"> <label>NombreCliente</label><input type="text" name="txtNombreCliente" class="form-control"> </div>
                    <div class="form-group"> <label>Codigo</label><input type="text" name="txtCodigo" class="form-control"> </div>
                    <div class="form-group"> <label>Empresa</label><input type="text" name="txtEmpresa" class="form-control"> </div>
                    <div class="form-group"> <label>Funcion</label><input type="text" name="txtFuncion" class="form-control"> </div>
                    <div class="form-group"> <label>Descuento</label><input type="text" name="txtDescuento" class="form-control"> </div>
                    <div class="form-group"> <label>TipoCliente</label><input type="text" name="txtTipoCliente" class="form-control"> </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                   
                </form>
                
            </div>
        </div>
            <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                <r>
                     <th>IdCliente</th>
                    <th>Contacto</th>
                    <th>NombreCliente</th>
                    <th>Codigo</th>
                    <th>Empresa</th>
                    <th>Funcion</th>
                    <th>Descuento</th>
                    <th>TipoCliente</th>
                    <th>Acciones</th>
                </r>
                </thead>
                <tbody>
                    
                <c:forEach var="em" items="${empresa}">
                    <tr>
                        <td>${em.getIdCliente()}</td>
                        <td>${em.getDpi()}</td>
                        <td>${em.getNombreCliente()}</td>
                        <td>${em.getCodigo()}</td>
                        <td>${em.getEmpresa()}</td>
                        <td>${em.getFuncion ()}</td>
                        <td>${em.getDescuento()}</td>
                        <td>${em.getTipoCliente()}</td>
                        <td> 
                            <a>Editar</a>
                            <a>Eliminar</a>
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
