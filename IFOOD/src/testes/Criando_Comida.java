/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import AUXILIAR.Categoria_ComboBox;
import Classes.Comida;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


    public class Criando_Comida implements Initializable {
       
         ArrayList<Categoria_ComboBox> aux = new ArrayList<>();
         ObservableList<Categoria_ComboBox> observar;
//       tipo  
         Categoria_ComboBox veget;
         Categoria_ComboBox vegan;

    @FXML
    private ComboBox<Categoria_ComboBox> tipo;
    @FXML
    private TextField nome;
    @FXML
    private TextField descricao;
    @FXML
    private TextField preco;
    @FXML
    private TextField tempo;
    @FXML
    private Button criar;
    @FXML
    private TextField cozinha;
    
    private int index = 0;
    int tempopreparo;
     String texto2;
     double valor;
  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarComboBox();
    }    
    
     public void carregarComboBox() {
            
     veget = new Categoria_ComboBox("Vegetariana",index);
     vegan = new Categoria_ComboBox("Vegana",index + 1);
     aux.add(veget);
     aux.add(vegan);
     observar = FXCollections.observableList(aux);
     tipo.setItems(observar);
    }
     
    @FXML
    private void metodoCozinha(ActionEvent event) {
    }
        
    @FXML
    private void input_nome(ActionEvent event) {
    }

    @FXML
    private void input_descricao(ActionEvent event) {
    }

    @FXML
    private void input_preco(ActionEvent event) {
    }

    @FXML
    private void input_tempo(ActionEvent event) {
    }
    
    @FXML
    private void buttonCriar(ActionEvent event) throws Exception {
         Categoria_ComboBox info = tipo.getSelectionModel().getSelectedItem();
        
        if(nome.getText().length() == 0 || nome.getText().length() < 4){
        JOptionPane.showMessageDialog(null, "ERROR: Nome incompleto ou insuficiente!");
        }
        
        else if(descricao.getText().length() == 0 || descricao.getText().length() <= 10){
        JOptionPane.showMessageDialog(null, "ERROR: Descrição incompleta ou insuficiente!");
        }
        
        else if(info.getTipo_de_Alimento() == null){
        JOptionPane.showMessageDialog(null, "ERROR: O tipo do alimento não foi definido!");
        }
        
        else if(cozinha.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "ERROR: Tipo de comida não foi definida!");
        }
        
        
//        INCOMPLETO - DEVE-SE COLOCAR O PREÇO COM DOUBLE
        else if(preco.getText().length() <= 0){
//        INCOMPLETO - DEVE-SE COLOCAR O TEMPO COMO DOUBLE
        }
        
        else if(tempo.getText().length() <= 0){
        
        }
        
        else{
        texto2 = preco.getText();
        valor = Double.parseDouble(texto2);
           tempopreparo = Integer.parseInt(tempo.getText());
        Comida mandar = new Comida(cozinha.getText().trim(), info.getTipo_de_Alimento(), nome.getText().trim(), descricao.getText().trim(), valor, tempopreparo);
        Pós_cadastro_estabelecimentoController.teste.add(mandar);
         utilitarios.changeToscene(getClass(), event, "Pós_cadastro_estabelecimento.fxml" );
         
//                                                               String tipoCozinha, String saude, String nome, String descricao, double preco, String tempoPreparo
          
            }
        }
    }

