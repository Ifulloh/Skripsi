/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ridwan
 */
public class koneksi {
public static Connection conn;
    
    public static Connection connect() { 
        if (conn==null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi "+ex);
        }
        try{
            String url = "jdbc:mysql://localhost:3306/skripsi";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
        }
        catch(SQLException ex){
             System.out.println("Gagal Koneksi Database"+ex);
        }
      }
    return conn;
  }  
}
