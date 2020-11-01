<%-- 
    Document   : Orden
    Created on : 25/10/2020, 02:57:25 PM
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
            <form action="ControladorPrincipal?menu=Orden" method="post">
        <div class="card-group">
            
  <div class="card">
    
    <div class="card-body">
        <%-- Opcion datos Cliente--%>
      <h5 class="card-title">Datos Cliente</h5>
        <%-- Opcion buscardor--%>
      <div class="form-row align-items-center d-flex">
    <div class=" from-group col-sm-4"><label></label><input type="text" value="${c.getIdCliente()}" name="txtId" class="form-control mb-4"  placeholder="Id Cliente"> </div>
    <input type="submit" name="accion" value="BuscarCliente" class="btn btn-info">

  </div>
        <%-- Opcion datos extras--%>
       <div class="row">
        <div class=" from-group col-sm-4"><label></label><input type="text" value="${c.getNombreCliente()}" name="txtNombreO" class="form-control"  placeholder="Contacto"> </div>
        <div class=" from-group col-sm-4"><label></label><input type="text" value="${c.getEmpresa()}" name="txtEmrepsaO" class="form-control"  placeholder="Empresa"> </div>
       
    
    </div>
      
        
    </div>
  
  </div>
  <div class="card">
     <div class="card-body">
          <%-- Opcion datos Producto--%>
      <h5 class="card-title">Datos Producto</h5>  
      <div class="form-row align-items-center">
          <div class=" from-group col-sm-4"><label></label><input type="text" value="${p.getIdProducto()}" name="txtcodigo" class="form-control mb-4"  placeholder="Codigo"> </div>
     <input type="submit" name="accion" value="BuscarProducto" class="btn btn-info">

  </div>
      <div class="row">
        <div class=" from-group col-sm-4"><label></label><input type="text" value="${p.getNombreParte()}" name="txtdescr"setNombreParte class="form-control"  placeholder="Nombre Producto"> </div>
        <div class=" from-group col-sm-2 "><label></label><input type="number" value="1" name="txtcant" class="form-control"  placeholder="Cantidad"> </div>
        <div class=" from-group col-sm-2"><label></label><input type="text" value="${p.getExistencia()}" name="txtId" class="form-control"  placeholder="Stock"> </div>
        <div class=" from-group col-sm-2"><label></label><input type="text" value="${p.getPrecio()}" name="txtpre" class="form-control"  placeholder="Q00.00"> </div>
    
    </div>
          <br>
    
    </div>
    </div>
            
    </div>
              <br>
              <div class="form-group">
                  <input
                      type="submit" name="accion" value="AgregarItems" class="btn btn-info ">
             </div>
              </form>
            </div>
      
       
     <div class="col-sm-9 align-items-center">
                <table class="table table-hover table table-striped" >
                    <thead  class="thead-dark">
                    <r>
                        <th>NoOrden</th>
                        <th>codigo</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                        <th>sub Total</th>
                        <th>Acciones</th>
                    </r>
                    </thead>
                    <tbody>

                      
                            >>>
                            <c:forEach  var="list" items="${carrito}">
                            <tr>
                                <td>${list.getIdOrden()}</td>
                                <td>${list.getCodigo()}</td>
                                <td>${list.getDescripcion()}</td>
                                <td>${list.getPrecio()}</td>
                                <td>${list.getCantidad()}</td>
                                <td>${list.getSubtotal()}</td>
                             
                            
                               
                                <td>
                                    <a class="btn btn-warning" href="ControladorPrincipal?menu=Orden&accion=Eliminar&ordeI=${list.getIdOrden()}">Eliminar</a>
                                </td>
                            </tr>
                            </c:forEach>
                    
                    </tbody>
                </table>
            </div>
                                <div>
                                        <input type="submit"href="ControladorPrincipal?=nemu=Orden&accion=Venta" class="btn btn-success">
                                        <input type="submit"  href="ControladorPrincipal?menu=Orden" value="Cancelar" class="btn btn-danger">
                                </div>         

            
   



        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>      
    </body>
</html>
