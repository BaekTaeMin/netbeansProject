import java.sql.*;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikk5515
 */
public class DB_MAN {
    
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/netbeans?useUnicode=true&serverTimezone=Asia/Seoul","root","");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return con;
    }
}