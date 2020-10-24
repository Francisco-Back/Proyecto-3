/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Francisco Back
 */
public class VariablesGlobales {
    public static final String DRIVE_DB="org.postgresql.Driver";
    public static final String URL_DB="jdbc:postgresql://localhost:5432/Proyecto3";
    public static final String USER_DB="postgres";
    public static final String PASSWORD_DB="fran*42313380";
    public static Connection conn;
    public Connection getConexion(){
        try{
            Class.forName(DRIVE_DB);
            conn=DriverManager.getConnection(URL_DB,USER_DB,PASSWORD_DB);
            Object Connection;
            
            if(conn!=null){
                
                System.out.println("si se conecta");
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            
        }
        return conn;
    }
}
