/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import Classes.Estabelecimento_backup;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


public class Criando_Restaurante implements Initializable {

    @FXML
    private TextField nomeRestal;
    @FXML
    private TextField nomeEnd;
    @FXML
    private Button proximo;
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inputNomeRestau(ActionEvent event) {
    }

    @FXML
    private void inputEndereco(ActionEvent event) {
    }

    @FXML
    private void inputProximo(ActionEvent event) throws Exception {
                
        if(nomeRestal.getText().length() == 0){
         JOptionPane.showMessageDialog(null, "ERROR: Name cannot be blank");
        }   
        else if(nomeEnd.getText().length() == 0){
         JOptionPane.showMessageDialog(null, "ERROR: Address cannot be blank");
        }
        else{
        Estabelecimento_backup cons = new Estabelecimento_backup(nomeRestal.getText().trim(),nomeEnd.getText().trim(), null);
        Cadastro_Estabelecimento.backupEst.add(cons);
              utilitarios.changeToscene(getClass(), event, "Pós_cadastro_estabelecimento.fxml");
        
        }

    }    
    
}
