/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Ortega
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexion () throws ClassNotFoundException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");          
            
            System.out.println("Conectado");
            
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        return cn;
        
    }
    
    
    
}