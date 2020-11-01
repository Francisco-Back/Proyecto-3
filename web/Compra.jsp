<%-- 
    Document   : Compra
    Created on : 25/10/2020, 02:55:58 PM
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
          <div class="col-sm-9 align-items-center">
             <table class="table table-hover table table-striped" >
                 <thead  class="thead-dark">
                 <r>
                     <th>Prodcuto</th>
                     <th>Cliente</th>
                     <th>Orden</th>
                     <th>Fecha</th>
                     <th>precio</th>
                     <th>Total</th>
                     <th>Envio</th>
                     <th>Estado</th>
                     <th>Dias De Envio</th>
                     <th>Cantidad</th>
                 </r>
                 </thead>
                 <tbody>

                   
                         >>>
                         <c:forEach  var="list" items="${compra}">
                             <tr>
                             <td>${list.getIdproducto()}</td>
                             <td>${list.getIdcli()}</td>
                            <td>${list.getIdOrden()}</td>
                            <td>${list.getFechaOrden()}</td>
                            <td>${list.getPrecioEnvio()}</td>
                            <td>${list.getTotal()}</td>
                            <td>${list.getEnvio()}</td>
                            <td>${list.getEstado()}</td>
                            <td>${list.getDiasEnvio()}</td>
                            <td>${list.getDescripcion()}</td>
                            
                            
                         
                            </tr>
                       
                         </c:forEach>
                 
                 </tbody>
             </table>
         </div>
 
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>      
    </body>
</html>
