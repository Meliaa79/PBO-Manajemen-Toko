/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

//import com.sun.jdi.connect.spi.Connection;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
//import java.sql.SQLException;
//import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author M E L I A
 */
public class koneksi {
    private static Connection connection;
    
        public static Connection getConnection() {
            if (connection==null) {
                try {
                    String url = "jdbc:mysql://localhost:3306/db_manajementoko";
                    String user = "root";
                    String pass = "";
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    connection = (Connection) DriverManager.getConnection(url, user, pass);
                } catch (SQLException ex) {
                    Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
                    //System.println("koneksi gagal "+e.getMessage());
                }
            }
            return connection;
        }

    
}
