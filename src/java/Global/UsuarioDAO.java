/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Francisco Back
 */
public class UsuarioDAO implements Validar{
    Connection conn;
    VariablesGlobales cn=new VariablesGlobales();
    PreparedStatement ps;
    ResultSet rs;
    String t;
     
        
    @Override
  
    public int Validar(Usuario user) {
         int r=0;
        String sql="Select * from USUARIOS where USUARIO=? and CONTRASENA=?";
        try{
           conn=cn.getConexion();
           ps=conn.prepareStatement(sql);
           ps.setString(1, user.getUsuario());
           ps.setString(2, user.getPassword());
           rs=ps.executeQuery();
           while(rs.next()){
               r=r+1;
               user.setUsuario(rs.getString("USUARIO"));
               user.setPassword(rs.getString("CONTRASENA"));
           }
           if(r==1){
              return 1;
           }else{
               return 0;
           }
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    
}
