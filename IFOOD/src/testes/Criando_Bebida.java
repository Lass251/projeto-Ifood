/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

//import java.net.URL;

import AUXILIAR.Categoria_ComboBox;
import Classes.Bebida;
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


public class Criando_Bebida implements Initializable {
   
         ArrayList<Categoria_ComboBox> aux = new ArrayList<>();
         ObservableList<Categoria_ComboBox> observar;
         Categoria_ComboBox tem;
         Categoria_ComboBox Ntem;

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
    private TextField tam;
    
    int tempopreparo;
    private int box = 0;
    String texto;
    double valor;
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarComboBox();
    }    
    
    public void carregarComboBox() {
       tem = new Categoria_ComboBox("Contém álcool", box);
       Ntem = new Categoria_ComboBox("Não contém álcool", box + 1);
       
       aux.add(tem);
       aux.add(Ntem);
       
       observar = FXCollections.observableList(aux);
       tipo.setItems(observar);

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
    private void input_tam(ActionEvent event) {
    
    }

    @FXML
    private void buttonCriar(ActionEvent event) throws Exception {
        
         Categoria_ComboBox alcool = tipo.getSelectionModel().getSelectedItem();
          
        //Categoria_ComboBox info = tipo.getSelectionModel().getSelectedItem();
        
        if(nome.getText().length() == 0 || nome.getText().length() < 4){
        JOptionPane.showMessageDialog(null, "ERROR: Nome incompleto ou insuficiente!");
        }
        
        else if(descricao.getText().length() == 0 || descricao.getText().length() <= 10){
        JOptionPane.showMessageDialog(null, "ERROR: Descição incompleta ou insuficiente!");
        }
        
        else if(alcool.getTipo_de_Alimento() == null){
        JOptionPane.showMessageDialog(null, "ERROR: O tipo do alimento não foi definido!");
        }
        
//        INCOMPLETO - DEVE-SE COLOCAR O PREÇO COM DOUBLE
        else if(preco.getText().length() == 0){
//        INCOMPLETO - DEVE-SE COLOCAR O TEMPO COMO DOUBLE
        }
        
        else if(tempo.getText().length() == 0){
        
        }
        
        else{                    
        texto = preco.getText();
        valor = Double.parseDouble(texto);
         tempopreparo = Integer.parseInt(tempo.getText());
         Bebida mandar1 = new Bebida(tam.getText().trim(), alcool.getTipo_de_Alimento(), nome.getText().trim(), descricao.getText().trim(), null, valor ,tempopreparo);
         Pós_cadastro_estabelecimentoController.teste.add(mandar1);
         utilitarios.changeToscene(getClass(), event, "Pós_cadastro_estabelecimento.fxml" );
         
//                              String tamanho, String alcool, String nome, String descricao, String tipo, String preco, String tempoPreparo
          
       }
        
        
        
    }
}