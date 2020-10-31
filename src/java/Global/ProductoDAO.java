/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Back
 */
public class ProductoDAO {
     Connection conn;
    VariablesGlobales cn = new VariablesGlobales();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    

   public List Lista() {
        String sql = "SELECT * FROM PRODUCTO ";
        List<Producto> lista = new ArrayList<>();
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setIdProducto(rs.getInt(1));
                pro.setNombreParte(rs.getString(2));
                pro.setCodigo(rs.getString(3));
                pro.setMarca(rs.getString(4));
                pro.setFuncion(rs.getString(5));
                pro.setPrecio(rs.getInt(6));
                pro.setExistencia(rs.getInt(7));
               
                lista.add(pro);
            }
        } catch (Exception e) {

        }
        return lista;
    }
   
   public int contador() {
       int contador = 0;
        String sql = "SELECT * FROM PRODUCTO";
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

    public int Agregar(Producto pro) {
        String sql = "INSERT INTO PRODUCTO(idproducto,nombreparte,codigo,marca,funcion,precio,existencia)VALUES(?,?,?,?,?,?,? )";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pro.getIdProducto());
            ps.setString(2, pro.getNombreParte());
            ps.setString(3, pro.getCodigo());
            ps.setString(4, pro.getMarca());
            ps.setString(5, pro.getFuncion());
            ps.setInt(6, pro.getPrecio());
            ps.setInt(7, pro.getExistencia());
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return r;
    }
    

    public Producto ListarId(int id) {
        Producto pro = new Producto();
        String sql = "SELECT * FROM PRODUCTO WHERE IdProducto=" + id;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setNombreParte(rs.getString(2));
                pro.setCodigo(rs.getString(3));
                pro.setMarca(rs.getString(4));
                pro.setFuncion(rs.getString(5));
                pro.setPrecio(rs.getInt(6));
                pro.setExistencia(rs.getInt(7));
               
            }
        } catch (Exception e) {

        }
        return pro;
    }

    public int Actulizar(Producto pro) {
        String sql = "UPDATE PRODUCTO SET nombreparte=?,codigo=?,marca=?,funcion=?,precio=?,existencia=? WHERE IdProducto=?";
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
          
            ps.setString(1, pro.getNombreParte());
            ps.setString(2, pro.getCodigo());
            ps.setString(3, pro.getMarca());
            ps.setString(4, pro.getFuncion());
            ps.setInt(5, pro.getPrecio());
            ps.setInt(6, pro.getExistencia());
            ps.setInt(7, pro.getIdProducto());
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return r;
    }

    public void Eliminar(int IdPliente) {
        String sql = "DELETE FROM PRODUCTO WHERE IdPliente= " + IdPliente;
        try {
            conn = cn.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }

    }
    
}
