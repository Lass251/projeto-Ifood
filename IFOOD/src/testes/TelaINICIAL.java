/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package testes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaINICIAL implements Initializable {
     static ArrayList<Consumidor_backup> backupCon = new ArrayList<>();
    
    @FXML
    private Button buttonacessar;
    @FXML
    private TextField inputlogin;
    @FXML
    private TextField inputsenha;
    @FXML
    private Button buttoncadastro;
    @FXML
    private Button estabelecimento; 
    
    private boolean verificacao = true;
    private boolean coletivo = true;
    String outStr = "",login = "";
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
  
      @FXML
    void acaocadatrar(ActionEvent event) throws Exception {
    utilitarios.changeToscene(getClass(), event, "Cadastro_Pessoa.fxml" );
    
    }

    @FXML
    void handleButtonAction(ActionEvent event) throws Exception {
   
           if (inputlogin.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "ERRO: nome não pode ser nulo");
            }
           
           else if (inputsenha.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "ERRO: senha não pode ser nula");
            }
           else{
                 for(Consumidor_backup s : backupCon){
                       if(inputlogin.getText().equals(s.getCadastro()) && inputsenha.getText().equals(s.getSenha())){ 
                           verificacao = false;
                                utilitarios.changeToscene(getClass(), event, "Pratilleira.fxml" );
                
            }
                       if(verificacao == true){
                     JOptionPane.showMessageDialog(null, "ERROR: O e-mail não existe!");
            }
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
    public void estabelecimentox(ActionEvent event) throws Exception{
        utilitarios.changeToscene(getClass(), event, "Cadastro_Estabelecimento.fxml" );
    }

}
    
