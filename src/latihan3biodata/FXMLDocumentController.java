/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3biodata;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author crowl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button proses;

    @FXML
    private Label label;

    @FXML
    private TextField Nama;

    @FXML
    private TextField Kelas;

    @FXML
    private TextField Alamat;

    @FXML
    private TextField Telepon;

    @FXML
    private TextArea HasilAkhir;

    @FXML
    private Button hapus;

    @FXML
    void Alamat(ActionEvent event) {

    }

    @FXML
    void Kelas(ActionEvent event) {

    }

    @FXML
    void Nama(ActionEvent event) {

    }

    @FXML
    void Telepon(ActionEvent event) {

    }

    @FXML
    void hapus(ActionEvent event) {
        HasilAkhir.setText("");
        Nama.setText("");
        Kelas.setText("");
        Alamat.setText("");
        Telepon.setText("");
    }

    @FXML
    void proses(ActionEvent event) {
        String nama = Nama.getText();
        String kelas = Kelas.getText();
        String alamat = Alamat.getText();
        String telepon = Telepon.getText();
        
        HasilAkhir.setText("\n Nama :"+nama+"\n Kelas :"+kelas+"\n Alamat :"+alamat+"\n Telepon :"+telepon);
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
