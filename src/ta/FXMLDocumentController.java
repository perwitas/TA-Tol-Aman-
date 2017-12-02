/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


/**
 *
 * @author Sandralio
 */
public class FXMLDocumentController {
    @FXML
    private JFXTextField no_kendaraan;

    @FXML
    private JFXTextArea hasil;

    @FXML
    private JFXButton btn_submit;

      @FXML
    private JFXButton btn_submit1;

    @FXML
    private JFXTextField masuk;

    @FXML
    private JFXTextField keluar;
        @FXML
    private ToggleGroup jenis;
     @FXML
    private RadioButton tb_truck;

    @FXML
    private RadioButton tb_bis;

    @FXML
    private RadioButton tb_mobil;
    String jenis1;
    
    @FXML
    void cetak(ActionEvent event) {
       
        if(tb_truck.isSelected()) {
        String kilomsk = masuk.getText();
        int msk = Integer.parseInt(kilomsk);
        
        String kiloklr = keluar.getText();
        int klr = Integer.parseInt(kiloklr);
        
        String nomer = no_kendaraan.getText();
        if(tb_truck.isSelected()){
            jenis1 = "Truk";
        }else if(tb_bis.isSelected()){
            jenis1 = "Bis";
        }else if(tb_mobil.isSelected()){
            jenis1 = "Mobil";
        }
        int harga = (klr-msk) * 4000;
        hasil.setText( "Nomer : " + nomer + "\n Anda membayar Rp " + Integer.toString(harga)+"\nJenis Kendaraan :"+jenis1);
    }
        else if(tb_bis.isSelected()) {
        String kilomsk = masuk.getText();
        int msk = Integer.parseInt(kilomsk);
        
        String kiloklr = keluar.getText();
        int klr = Integer.parseInt(kiloklr);
        
        String nomer = no_kendaraan.getText();
         if(tb_truck.isSelected()){
            jenis1 = "Truk";
        }else if(tb_bis.isSelected()){
            jenis1 = "Bis";
        }else if(tb_mobil.isSelected()){
            jenis1 = "Mobil";
        }
    
        int harga = (klr-msk) * 3500;
        hasil.setText("Nomer : " + nomer + "\n Anda membayar Rp " + Integer.toString(harga)+"\nJenis Kendaraan :"+jenis1);
    }
        else if(tb_mobil.isSelected()) {
        String kilomsk = masuk.getText();
        int msk = Integer.parseInt(kilomsk);
        
        String kiloklr = keluar.getText();
        int klr = Integer.parseInt(kiloklr);
         if(tb_truck.isSelected()){
            jenis1 = "Truk";
        }else if(tb_bis.isSelected()){
            jenis1 = "Bis";
        }else if(tb_mobil.isSelected()){
            jenis1 = "Mobil";
        }
         
        String nomer = no_kendaraan.getText();
    
        int harga = (klr-msk) * 2500 ;
        hasil.setText("Nomer : " + nomer + "\n Anda membayar Rp " + Integer.toString(harga)+"\nJenis Kendaraan :"+jenis1);
    }
}
}


  
    

