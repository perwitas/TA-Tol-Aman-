/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXButton;
/**
 * FXML Controller class
 *
 * @author Sandralio
 */
public class MasukController implements Initializable {

    @FXML
       private JFXButton btn_masuk; 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  
    @FXML
    void Masuk(ActionEvent event) throws IOException {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Menu");
            stage.show();
    }
            
    }
    
