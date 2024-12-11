/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author joaof_cpnn023
 */
public class Bebida_ou_Comida implements Initializable {

    @FXML
    private Button bebida;
    @FXML
    private Button comida;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void chamaBebida(ActionEvent event) throws Exception {
           utilitarios.changeToscene(getClass(), event, "Criando_Bebida.fxml");
    }

    @FXML
    private void chamarComida(ActionEvent event) throws Exception {
           utilitarios.changeToscene(getClass(), event, "Criando_Comida.fxml");
    }
    
}
