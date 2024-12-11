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
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import Classes.*;


public class Cadastro_Pessoa implements Initializable {

    @FXML
    private Button buttoncadastrar2;
    @FXML
    private TextField inputcadastro;
    @FXML
    private TextField inputsenhacadastro;
    @FXML
    private Button voltar;
    @FXML
    private TextField inputcelular;
    
    private int index = 0;
   
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void cadastrar(ActionEvent event) {


        boolean validar = true;
        if (validar == true) {
            if (inputcadastro.getText().trim().length() == 0 || inputcadastro.getText().trim().length() < 4) {
                JOptionPane.showMessageDialog(null, "ERRO: tamanho de nome insuficiente");
                validar = false;
            }
        }

//    --------------------------------------------------------------------------
        if (validar == true) {
            if (inputcadastro.getText().contains("@gmail.com") == false) {
                JOptionPane.showMessageDialog(null, "ERROR: o email deve conter @gmail.com");
                validar = false;
            }
        }

//   ---------------------------------------------------------------------------
        if (validar == true) {
            if (inputsenhacadastro.getText().trim().length() == 0 || inputsenhacadastro.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "ERRO: tamanho de senha insuficiente");
                validar = false;
            }
        }
        
         if (validar == true) {
            if (inputcelular.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "ERRO: número não pode ser nulo");
                validar = false;
            }
        }

//     -------------------------------------------------------------------------
         if (validar == true) {
            Consumidor_backup s = new Consumidor_backup(inputcadastro.getText().trim(),inputsenhacadastro.getText().trim(),inputcelular.getText().trim());
            TelaINICIAL.backupCon.add(s);
            index++;
            JOptionPane.showMessageDialog(null, "Successo");
        }
        
    }

    @FXML
    private void logincadastro(ActionEvent event) {
    }

    @FXML
    private void senhacadastro(ActionEvent event) {
    }
    
    @FXML
    void inputcelular(ActionEvent event) {
     }
   
    @FXML
    public void buttonvoltar(ActionEvent event) throws Exception{
        utilitarios.changeToscene(getClass(), event, "TelaINICIAL.fxml");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
   
}
