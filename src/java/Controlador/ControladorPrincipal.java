/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Global.UsuarioDAO;
import Herencia.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Empresa em= new Empresa();
    UsuarioDAO edao= new UsuarioDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu=request.getParameter("menu");
        String accion=request.getParameter("accion");
        if(menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if(menu.equals("Ingesar_Cliente")){
            switch(accion){
                case  "Listar": 
                    List lista=edao.Lista();
                request.setAttribute("empresa", lista);
                
                    break; 
                case  "Agregar":
                    int id=1+edao.contador();
                    String Dpi=request.getParameter("txtContacto");
                    String nombre=request.getParameter("txtNombreCliente");
                    String codigo=request.getParameter("txtCodigo");
                    String empres=request.getParameter("txtEmpresa");
                    String fun=request.getParameter("txtFuncion");
                    String descuen=request.getParameter("txtDescuento");
                    String tipo=request.getParameter("txtTipoCliente");
                    int decuento=Integer.parseInt(descuen);
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
                case  "Editar":break;
                case  "Eliminar":break;
                default: throw new AssertionError();
            }
            request.getRequestDispatcher("Ingesar_Cliente.jsp").forward(request, response);
            
        }
        if(menu.equals("Ingesar_Producto")){
            request.getRequestDispatcher("Ingesar_Producto.jsp").forward(request, response);
            
        }
        if(menu.equals("Compra")){
            request.getRequestDispatcher("Compra.jsp").forward(request, response);
            
        }
        if(menu.equals("Orden")){
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
