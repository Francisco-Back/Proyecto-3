/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Back
 */
public class CompraDAO {
     Connection conn;
    VariablesGlobales cn = new VariablesGlobales();
    PreparedStatement ps;
    ResultSet rs;
    int r;

        public Compra Buscar(int codigo){
        Compra co= new Compra ();
        String sql="SELECT * FROM PRODUCTO WHERE IdProducto="+codigo;
        try{
            conn=cn.getConexion();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
           /*      co.setIdProducto(rs.getInt(1));
                co.setNombreParte(rs.getString(2));
                co.setCodigo(rs.getString(3));
                co.setMarca(rs.getString(4));
                co.setFuncion(rs.getString(5));
                co.setPrecio(rs.getInt(6));
                co.setExistencia(rs.getInt(7));*/
            }
        }catch(Exception e){
            
        }
        return co;
    }

   public List Listac() {
        String sql = "SELECT * FROM Compra";
        List<Compra> listap = new ArrayList<>();
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               Compra cop = new Compra();
             cop.setIdproducto(rs.getInt(1));
             cop.setIdcli(rs.getInt(2));
             cop.setIdOrden(rs.getInt(3));
             cop.setFechaOrden(rs.getDate(4));
             cop.setPrecioEnvio(rs.getDouble(5));
             cop.setTotal(rs.getDouble(6));
             cop.setEnvio(rs.getString(7));
             cop.setEstado(rs.getString(8));
             cop.setDiasEnvio(rs.getInt(9));
             cop.setDescripcion(rs.getString(10));
                listap.add(cop);
            }
        } catch (Exception e) {

        }
        return listap;
    }
   
   public int contador() {
       int contador = 0;
        String sql = "SELECT * FROM COMPRA";
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

    public int Agregar(Compra comp) {
        String sql = "INSERT INTO COMPRAVALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
          /*  conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, comp.getIdproducto());
            ps.setInt(2, comp.getIdcli());
            ps.setInt(3, comp.getIdOrden());
            ps.setDate(4, comp.get());
            ps.setString(5, pro.getFuncion());
            ps.setInt(6, pro.getPrecio());
            ps.setInt(7, pro.getExistencia());
            ps.executeUpdate();*/

        } catch (Exception e) {

        }
        return r;
    }
    

    public Compra ListarId(int id) {
        Compra pro = new Compra();
        String sql = "SELECT * FROM PRODUCTO WHERE IdProducto=" + id;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
              /*  pro.setNombreParte(rs.getString(2));
                pro.setCodigo(rs.getString(3));
                pro.setMarca(rs.getString(4));
                pro.setFuncion(rs.getString(5));
                pro.setPrecio(rs.getInt(6));
                pro.setExistencia(rs.getInt(7));*/
               
            }
        } catch (Exception e) {

        }
        return pro;
    }

    public int Actulizar(Compra comp) {
        String sql = "UPDATE PRODUCTO SET nombreparte=?,codigo=?,marca=?,funcion=?,precio=?,existencia=? WHERE IdProducto=?";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
          
         /*   ps.setString(1, pro.getNombreParte());
            ps.setString(2, pro.getCodigo());
            ps.setString(3, pro.getMarca());
            ps.setString(4, pro.getFuncion());
            ps.setInt(5, pro.getPrecio());
            ps.setInt(6, pro.getExistencia());
            ps.setInt(7, pro.getIdProducto());
            ps.executeUpdate();*/

        } catch (Exception e) {

        }
        return r;
    }

    public void Eliminar(int IdProducto) {
        String sql = "DELETE FROM PRODUCTO WHERE IdProducto= " + IdProducto;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        

    }
}
