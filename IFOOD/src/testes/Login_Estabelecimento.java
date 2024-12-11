/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import Classes.AUXILIAR;
import Classes.Estabelecimento_backup;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


public class Login_Estabelecimento implements Initializable {
    
//    AUXILIAR user = 
    
    @FXML
    private Button buttonacessar;
    @FXML
    private TextField inputlogin;
    @FXML
    private TextField inputsenha;
    @FXML
    private Button voltar;
    @FXML
    private TextField cnpj;
    @FXML
    private Button buna;
    
    static int index2 = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 

    @FXML
    void buttonvoltar(ActionEvent event) throws Exception {
    utilitarios.changeToscene(getClass(), event, "Cadastro_Estabelecimento.fxml" );
    }

    @FXML
    void handleButtonAction(ActionEvent event) throws Exception {

         if(inputlogin.getText().length() == 0 ){
        JOptionPane.showMessageDialog(null, "ERROR: e-mail canot be blanck");
        }
         
         if(inputlogin.getText().contains("@gmail.com") == false){
        JOptionPane.showMessageDialog(null, "ERROR: the name must have @gmail.com");
        }
        
          else if(inputsenha.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "ERROR: Password canot be blanck");
          }
        
        else if(cnpj.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "ERROR: CNPJ canot be blanck");
        
                     }
        else{
                    for(Estabelecimento_backup s : Cadastro_Estabelecimento.backupEst){
                        if(inputlogin.getText().trim().equals(s.getCadastro()) && inputsenha.getText().trim().equals(s.getSenha()) && cnpj.getText().trim().equals(s.getCnpj())){ 
                            utilitarios.changeToscene(getClass(), event, "Criando_Restaurante.fxml");
                            
                        }
                        index2++;
                }
            }
            
        }

    @FXML
    void login(ActionEvent event) {
    }

    @FXML
    void senha(ActionEvent event) {
    }
   
    @FXML
    private void inputCNPJ(ActionEvent event) {
    }

    @FXML
    private void luqueta(ActionEvent event) throws Exception {
          utilitarios.changeToscene(getClass(), event, "Criando_Restaurante.fxml" );
    }
    
}

