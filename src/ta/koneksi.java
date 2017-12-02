/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandralio
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    /** 
     *
     */
    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/tol", "root", "");
            stm= (Statement) con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
        }
    }
}
