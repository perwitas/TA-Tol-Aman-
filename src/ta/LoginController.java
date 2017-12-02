/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.scene.control.PasswordField;
/**
 * FXML Controller class
 *
 * @author Sandralio
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane btnlogin;
    @FXML
    private Button btnok;
    @FXML
    private JFXTextField username;
    @FXML
    private PasswordField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ok(ActionEvent event) throws SQLException {
        try {
             Connection con;
             Statement stat;
             ResultSet rs;
             String sql;
        //pemanggilan fungsi koneksi database yang sudah kita buat pada class koneksi.java
                     koneksi DB = new koneksi();
                        DB.config();
                        con = DB.con;
                        stat = DB.stm;
              sql = "SELECT * FROM admin WHERE username='"+username.getText()+""
                      + "' AND passwod='"+password.getText()+"'";
              rs = stat.executeQuery(sql);
              if(rs.next()){
                if(password.getText().equals(rs.getString("username"
                        + "")) && password.getText().equals(rs.getString("passwod"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("masuk.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("TA");
            stage.show();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
            // Hide this current window (if this is what you want)
            
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }

