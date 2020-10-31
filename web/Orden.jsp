<%-- 
    Document   : Orden
    Created on : 25/10/2020, 02:57:25 PM
    Author     : Francisco Back
--%>

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
            <form action="Controladorprin" metodo="post">
        <div class="card-group">
            
  <div class="card">
    
    <div class="card-body">
    
      <h5 class="card-title">Datos Cliente</h5>
      <div class="form-row align-items-center d-flex">
    <div class=" from-group col-sm-4"><label></label><input type="text" value="" name="txtId" class="form-control mb-4"  placeholder="Codigo"> </div>
    <input type="submit" name="accion" value="Buscar" class="btn btn-info">
   
  
  </div>
       <div class="row">
        <div class=" from-group col-sm-4"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Contacto"> </div>
        <div class=" from-group col-sm-4"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Empresa"> </div>
       
    
    </div>
      
        
    </div>
  
  </div>
  <div class="card">
     <div class="card-body">
        
      <h5 class="card-title">Datos Producto</h5>  
      <div class="form-row align-items-center">
    <div class=" from-group col-sm-4"><label></label><input type="text" value="" name="txtId" class="form-control mb-4"  placeholder="Codigo"> </div>
     <input type="submit" name="accion" value="Buscar" class="btn btn-info">

  </div>
      <div class="row">
        <div class=" from-group col-sm-4"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Nombre Producto"> </div>
        <div class=" from-group col-sm-2"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Cantidad"> </div>
        <div class=" from-group col-sm-2"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Stock"> </div>
        <div class=" from-group col-sm-2"><label></label><input type="text" value="" name="txtId" class="form-control"  placeholder="Q00.00"> </div>
    
    </div>
          <br>
    
    </div>
    </div>
            
    </div>
              <br>
        <div>
             <input type="submit" name="accion" value="Agregar" class="btn btn-info">
             </div>
              </form>
            </div>
      
       
     <div class="col-sm-9 align-items-center">
                <table class="table table-hover table table-striped" >
                    <thead  class="thead-dark">
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

                      
                            >>>
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
                                    <a class="btn btn-primary" href="ControladorPrincipal?menu=Ingesar_Cliente&accion=Editar&IdC=${em.getIdCliente()}">Editar</a>
                                    <a class="btn btn-warning" href="ControladorPrincipal?menu=Ingesar_Cliente&accion=Eliminar&IdC=${em.getIdCliente()}">Eliminar</a>
                                </td>
                            </tr>
                    
                    </tbody>
                </table>
            </div>
                                <div>
                                        <input type="submit" name="accion" value="Ventan" class="btn btn-success">
                                        <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                                </div>         

            
   



        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>      
    </body>
</html>
