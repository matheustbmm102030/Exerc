/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label_Numero;
    @FXML
    private Label label_resultDobro;
    @FXML
    private Label label_resultTriplo;
    @FXML
    private Label label_resultQuadrado;
    @FXML
    private Label label_resultCubo;
    @FXML
    private Label label_resultTriplo1;
    @FXML
    private Label label_resultQuadrado1;
    @FXML
    private Label label_resultCubo1;
    @FXML
    private Label label_resultDobro1;
    @FXML
    private TextField textField_valorInserir;
    @FXML
    private Button buttonCalcula;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String a=(textField_valorInserir.getText());
        double val=Double.parseDouble(a);
        
        label_resultDobro1.setText(val*2);
        label_resultTriplo1.setText(val*3);
        label_resultQuadrado1.setText(val*val);
        label_resultCubo1.setText(val*val*val);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    
    
    /*
        double val=double.parseDouble(textField_valorInserir);
        val=textField_valorInserir.getText();
        label_resultDobro1.setText(val);
    */
}
