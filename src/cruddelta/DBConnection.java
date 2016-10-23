/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruddelta;
import java.sql.*;

/**
 *
 * @author wohhie
 */
public class DBConnection {
    
    private static String url = "jdbc:mysql://localhost/crud";
    private static String drivername = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "";
    private static Connection conn;
    
    
    public static Connection ConnectDB(){
        try{
            Class.forName(drivername);
            try{
                conn = DriverManager.getConnection(url, username, password);
                
            }catch(SQLException ex){
                System.out.println("Faild to create the connection.");
            }
            
        }catch(Exception ex){
            System.out.println("Failed to create the connection.");
        }
        
        return conn;
    }
}
