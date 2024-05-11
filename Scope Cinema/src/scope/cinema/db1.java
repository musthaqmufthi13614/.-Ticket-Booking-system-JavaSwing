/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope.cinema;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class db1 {
    
      Connection conn = null;
    
   public static Connection java_db(){
        
        try{
//           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/scope_cinema", "root","");
           return conn;
        
        }catch(Exception ex){
            
        }
        return null;
        
    }
    
    
    
}
