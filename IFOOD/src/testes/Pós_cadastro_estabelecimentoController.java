/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import Heranças.Global2;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


    public class Pós_cadastro_estabelecimentoController implements Initializable {
         static ArrayList<Global2> teste = new ArrayList<>();
           
         
    @FXML
    private Label prodSelect;
    @FXML
    private ComboBox<String> semideia;
    @FXML
    private Button buttonVoltar;
    @FXML
    private Button buttonCriar;
    @FXML
    private Button retirar;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    mostrarDados();
    }    
      
    public void mostrarDados(){
   
        for(int i = 0; i  < teste.size() ; i++) {
            semideia.getItems().add(teste.get(i).getNome());
        }
    }

    @FXML
    private void metodoVoltar(ActionEvent event) throws Exception {
    utilitarios.changeToscene(getClass(), event, "TelaINICIAL.fxml");
    }

    @FXML
    private void metodoCriar(ActionEvent event) throws Exception {
    utilitarios.changeToscene(getClass(), event, "Bebida_ou_Comida.fxml");
    }
    
    @FXML
    private void metodoRetirar(ActionEvent event) {
    String selecionado = semideia.getValue(); 

    if (selecionado != null) {
        Global2 remover = null;
        for (Global2 s : teste) {
            if (selecionado.equals(s.getNome())) {
                remover = s;
                break; 
            }
        }

        if (remover != null) {
            teste.remove(remover); 
            semideia.getItems().remove(selecionado); 
            prodSelect.setText(""); 
        }
    }
}
    
    @FXML
    private void selecionar(ActionEvent event) {
    String selecionado = semideia.getValue();
    for (Global2 s : teste) {
        if (selecionado.equals(s.getNome())) { 
            prodSelect.setText(s.toString()
            );
            break; 
                   }
             }
         }

     }