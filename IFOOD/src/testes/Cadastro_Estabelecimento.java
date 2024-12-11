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
import java.util.ArrayList;

    public class Cadastro_Estabelecimento implements Initializable {
    
        static ArrayList<Estabelecimento_backup> backupEst = new ArrayList<>();
    
    @FXML
    private Button buttoncadastrar;
    @FXML
    private Button buttonlogin;
    @FXML
    private TextField email;
    @FXML
    private TextField endereco;
    @FXML
    private TextField nome;
    @FXML
    private TextField senha;
    @FXML
    private Button voltar;
    @FXML
    private TextField cnpj;
    
    static int index = 0;
    boolean teste = true;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    void caixacelular(ActionEvent event) {
    }
    
    @FXML
    void caixaemail(ActionEvent event) {
    }

    @FXML
    void caixaendereco(ActionEvent event) {
    }

    void caixahora(ActionEvent event) {
    }

    @FXML
    void caixanome(ActionEvent event) {
    }

    void caixarazao(ActionEvent event) {
    }

    void caixasegmento(ActionEvent event) {
    }

    @FXML
    void caixasenha(ActionEvent event) {
    }
    
    @FXML
    void buttoncadastrar(ActionEvent event) throws Exception {
        if(nome.getText().length() == 0 || nome.getText().length() < 4 || email.getText().length() == 10){
        JOptionPane.showMessageDialog(null, "ERROR: Name cannot be blank");
        }
        
        else if(email.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "ERROR: e-mail cannot be blank");
        }
        
        else if(email.getText().contains("@gmail.com") == false){
       JOptionPane.showMessageDialog(null, "ERROR: The name must have @gmail.com");
        }
        
          else if(cnpj.getText().length() == 0 || cnpj.getText().length() != 14){
        JOptionPane.showMessageDialog(null, "ERROR: CNPJ cannot be blank or incomplete");
          }
        
         else if(endereco.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "ERROR: Address cannot be blank");
        }
        
         else if(senha.getText().length() == 0 || senha.getText().length() < 8){
        JOptionPane.showMessageDialog(null, "ERROR: password cannot be blank");
        }

         else{
//                                                                               String nome, String email, String senha, String cnpj, int nada
             Estabelecimento_backup objeto = new Estabelecimento_backup(nome.getText().trim(),email.getText().trim(),senha.getText().trim(),cnpj.getText().trim(), 0);
             backupEst.add(objeto);
             index++;
             JOptionPane.showMessageDialog(null, "Conta criada!" + index);
         }
    }
    
    @FXML
    void buttonlogin(ActionEvent event) throws Exception {
        utilitarios.changeToscene(getClass(), event, "Login_Estabelecimento.fxml" );
    }
    
    @FXML
    public void buttonvoltar(ActionEvent event) throws Exception{
        utilitarios.changeToscene(getClass(), event, "TelaINICIAL.fxml");
    }
    
    @FXML
    private void caixaCNPJ(ActionEvent event) {
    }

}
  

//        if(teste){
//            for(Estabelecimento_backup s : backupEst){
//                if(email.getText().trim().equals(s.getCadastro())){
//                 JOptionPane.showMessageDialog(null, "ERROR!");
//                }
//                 else{
//                    teste = false;
//             Estabelecimento_backup objeto = new Estabelecimento_backup(nome.getText().trim(),email.getText().trim(),senha.getText().trim(),cnpj.getText().trim(), 0);
//             backupEst.add(objeto);
//       
//        JOptionPane.showMessageDialog(null, "Estabelecimento cadastrado: " + i);
//                }
//            }
//       }
    

