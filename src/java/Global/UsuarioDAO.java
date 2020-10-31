/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Cliente;
import Clases.Usuario;
import Herencia.Empresa;
import Herencia.Individual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Francisco Back
 */
public class UsuarioDAO implements Validar {

    Connection conn;
    VariablesGlobales cn = new VariablesGlobales();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    public Cliente Buscar(int id){
        Empresa nf= new Empresa ();
        String sql="SELECT *FROM CLIENTE WHERE idcliente="+id;
        try{
            conn=cn.getConexion();
            ps=conn.prepareStatement(sql);
            ps.executeQuery();
            while(rs.next()){
                  nf.setIdCliente(rs.getInt(1));
                nf.setDpi(rs.getString(2));
                nf.setNombreCliente(rs.getString(3));
                nf.setCodigo(rs.getString(4));
                nf.setEmpresa(rs.getString(5));
                nf.setFuncion(rs.getString(6));
                nf.setDescuento(rs.getInt(7));
                nf.setTipoCliente(rs.getString(8));
            }
        }catch(Exception e){
            
        }
        return nf;
    }

    @Override
// se crea el metodo validar usuario
    public int Validar(Usuario user) {
        int r = 0;
        String sql = "Select * from USUARIOS where USUARIO=? and CONTRASENA=?";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                user.setUsuario(rs.getString("USUARIO"));
                user.setPassword(rs.getString("CONTRASENA"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

   public List Lista() {
        String sql = "SELECT * FROM CLIENTE ";
        List<Empresa> lista = new ArrayList<>();
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empresa em = new Empresa();
                em.setIdCliente(rs.getInt(1));
                em.setDpi(rs.getString(2));
                em.setNombreCliente(rs.getString(3));
                em.setCodigo(rs.getString(4));
                em.setEmpresa(rs.getString(5));
                em.setFuncion(rs.getString(6));
                em.setDescuento(rs.getInt(7));
                em.setTipoCliente(rs.getString(8));
                lista.add(em);
            }
        } catch (Exception e) {

        }
        return lista;
    }
   
   public int contador() {
       int contador = 0;
        String sql = "SELECT * FROM CLIENTE";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            contador++;
            }
        } catch (Exception e) {

        }
        return contador;
    }    

    public int Agregar(Empresa em) {
        String sql = "INSERT INTO ClIENTE(idcliente,dpi,nombrecliente,codigo,empresa,funcion,descuento,cliente1)VALUES(?,?,?,?,?,?,?,? )";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, em.getIdCliente());
            ps.setString(2, em.getDpi());
            ps.setString(3, em.getNombreCliente());
            ps.setString(4, em.getCodigo());
            ps.setString(5, em.getEmpresa());
            ps.setString(6, em.getFuncion());
            ps.setInt(7, em.getDescuento());
            ps.setString(8, em.getTipoCliente());
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return r;
    }
    

    public Empresa ListarId(int id) {
        Empresa em = new Empresa();
        String sql = "SELECT * FROM CLIENTE WHERE IdCliente=" + id;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setDpi(rs.getString(2));
                em.setNombreCliente(rs.getString(3));
                em.setCodigo(rs.getString(4));
                em.setEmpresa(rs.getString(5));
                em.setFuncion(rs.getString(6));
                em.setDescuento(rs.getInt(7));
                em.setTipoCliente(rs.getString(8));
            }
        } catch (Exception e) {

        }
        return em;
    }

    public int Actulizar(Empresa em) {
        String sql = "UPDATE ClIENTE SET dpi=?,nombrecliente=?,codigo=?,empresa=?,funcion=?,descuento=?,cliente1=? WHERE idcliente=?";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
          
            ps.setString(1, em.getDpi());
            ps.setString(2, em.getNombreCliente());
            ps.setString(3, em.getCodigo());
            ps.setString(4, em.getEmpresa());
            ps.setString(5, em.getFuncion());
            ps.setInt(6, em.getDescuento());
            ps.setString(7, em.getTipoCliente());
            ps.setInt(8, em.getIdCliente());
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return r;
    }

    public void Eliminar(int IdCliente) {
        String sql = "DELETE FROM CLIENTE WHERE IdCliente= " + IdCliente;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }

    }
 
   
}
