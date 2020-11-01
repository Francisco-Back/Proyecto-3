/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Producto;
import Global.ProductoDAO;
import Global.UsuarioDAO;
import Herencia.Empresa;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco Back
 */
@WebServlet(name = "ControladorPrincipal", urlPatterns = {"/ControladorPrincipal"})
public class ControladorPrincipal extends HttpServlet {


    Empresa em = new Empresa();
    UsuarioDAO edao = new UsuarioDAO();
    int aux;
    int auxp;
    Producto pro=new Producto();
    ProductoDAO pedao=new ProductoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
       
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Ingesar_Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.Lista();
                    request.setAttribute("empresa", lista);

                    break;
                case "Agregar":
                    int id = 1 + edao.contador();
                    String Dpi = request.getParameter("txtContacto");
                    String nombre = request.getParameter("txtNombreCliente");
                    String codigo = request.getParameter("txtCodigo");
                    String empres = request.getParameter("txtEmpresa");
                    String fun = request.getParameter("txtFuncion");
                    String descuen = request.getParameter("txtDescuento");
                    String tipo = request.getParameter("txtTipoCliente");
                    int decuento = Integer.parseInt(descuen);
                    em.setIdCliente(id);
                    em.setDpi(Dpi);
                    em.setNombreCliente(nombre);
                    em.setCodigo(codigo);
                    em.setEmpresa(empres);
                    em.setFuncion(fun);
                    em.setDescuento(decuento);
                    em.setTipoCliente(tipo);
                    edao.Agregar(em);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    aux = Integer.parseInt(request.getParameter("IdC"));
                    Empresa h = edao.ListarId(aux);
                    request.setAttribute("empres", h);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Cliente&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":

                    String Dpi1 = request.getParameter("txtContacto");
                    String nombre1 = request.getParameter("txtNombreCliente");
                    String codigo1 = request.getParameter("txtCodigo");
                    String empres1 = request.getParameter("txtEmpresa");
                    String fun1 = request.getParameter("txtFuncion");
                    String descuen1 = request.getParameter("txtDescuento");
                    String tipo1 = request.getParameter("txtTipoCliente");
                    int decuento1 = Integer.parseInt(descuen1);

                    em.setDpi(Dpi1);
                    em.setNombreCliente(nombre1);
                    em.setCodigo(codigo1);
                    em.setEmpresa(empres1);
                    em.setFuncion(fun1);
                    em.setDescuento(decuento1);
                    em.setTipoCliente(tipo1);
                    em.setIdCliente(aux);
                    edao.Actulizar(em);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Cliente&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    aux = Integer.parseInt(request.getParameter("IdC"));
                    edao.Eliminar(aux);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Cliente&accion=Listar").forward(request, response);
                    break;
                case "Busqueda": 
                  //String s=request.getParameter("op");
                   
                   
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Cliente&accion=Busqueda").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Ingesar_Cliente.jsp").forward(request, response);

        }
        
        if (menu.equals("Ingesar_Producto")) {
            
             switch (accion) {
                case "Listar":
                    List listap = pedao.Lista();
                    request.setAttribute("producto", listap);

                    break;
                case "Agregar":
                    int id = 1 + pedao.contador();
                    String nombreparte = request.getParameter("txtNombreParte");
                    String codigoparte = request.getParameter("txtCodigo");
                    String marcaparte = request.getParameter("txtMarca");
                    String funcionparte = request.getParameter("txtFuncion");
                    String pecioparte = request.getParameter("txtprecio");
                    String existenciaparte = request.getParameter("txtExistencia");
                    int Existencia = Integer.parseInt(existenciaparte);
                    int precio = Integer.parseInt(pecioparte);
                    pro.setIdProducto(id);
                    pro.setNombreParte(nombreparte);
                    pro.setCodigo(codigoparte);
                    pro.setMarca(marcaparte);
                    pro.setFuncion(funcionparte);
                    pro.setPrecio(precio);
                    pro.setExistencia(Existencia);
                    pedao.Agregar(pro);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    auxp = Integer.parseInt(request.getParameter("IdC"));
                    Producto p = pedao.ListarId(auxp);
                    request.setAttribute("produc", p);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":

                    String nombreparte1 = request.getParameter("txtNombreParte");
                    String codigoparte1 = request.getParameter("txtCodigo");
                    String marcaparte1 = request.getParameter("txtMarca");
                    String funcionparte1 = request.getParameter("txtFuncion");
                    String pecioparte1 = request.getParameter("txtprecio");
                    String existenciaparte1 = request.getParameter("txtExistencia");
                    int Existencia1 = Integer.parseInt(existenciaparte1);
                    int precio1 = Integer.parseInt(pecioparte1);
                    pro.setIdProducto(auxp);
                    pro.setNombreParte(nombreparte1);
                    pro.setCodigo(codigoparte1);
                    pro.setMarca(marcaparte1);
                    pro.setFuncion(funcionparte1);
                    pro.setPrecio(precio1);
                    pro.setExistencia(Existencia1);
                    pedao.Actulizar(pro);
                    request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Producto&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    auxp = Integer.parseInt(request.getParameter("IdC"));
                   pedao.Eliminar(auxp);
                     request.getRequestDispatcher("ControladorPrincipal?menu=Ingesar_Producto&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Ingesar_Producto.jsp").forward(request, response);

        }
        
        
        
        
        if (menu.equals("Compra")) {
            request.getRequestDispatcher("Compra.jsp").forward(request, response);

        }
        if (menu.equals("Orden")) {
           switch(accion){
               case "BuscarCliente":
                   int id=Integer.parseInt(request.getParameter("txtId"));
                   em.setIdCliente(id);
                   em = edao.Buscar(id);
               request.setAttribute("c", em);
                  break;
               case "BuscarProducto":
                   int ids=Integer.parseInt(request.getParameter("txtcodigo"));
                   pro.setIdProducto(ids);
                   pro =pedao.Buscar(ids);
                   request.setAttribute("p", pro);
                   break;
                default:
                    
            }
         
            request.getRequestDispatcher("Orden.jsp").forward(request, response);

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
