/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testes;

import Heranças.Global2;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


    public class Pratilleira implements Initializable {

    @FXML
    private Label carrinho;
    @FXML
    private Button pagar;
    @FXML
    private Button voltar;
    @FXML
    private ListView<Global2> Alimentos;
    @FXML
    private Button adicionar;
    @FXML
    private Button finalizar;
    @FXML
    private Button limpar;
    @FXML
    private ListView<String> listaCarrinho;
    @FXML
    private Label infos;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        popular();
     }    
    
    @FXML
    private void pagar(ActionEvent event) {
    }
    
    public void popular(){
        Alimentos.getItems().addAll(Pós_cadastro_estabelecimentoController.teste);

    }
    

    @FXML
    private void voltar(ActionEvent event) throws Exception {
           utilitarios.changeToscene(getClass(), event, "TelaINICIAL.fxml");
    }

    @FXML
    private void metodoAdd(ActionEvent event) {
    Global2 produtoSelecionado = Alimentos.getSelectionModel().getSelectedItem();

    if (produtoSelecionado != null) {
        listaCarrinho.getItems().add(produtoSelecionado.getNome());

        atualizarInfos();
    } else {
        System.out.println("Nenhum item selecionado.");
    }
}

    private void atualizarInfos() {
    double precoTotal = 0;
    int tempoTotal = 0;

    for (String nomeProduto : listaCarrinho.getItems()) {
        for (Global2 produto : Alimentos.getItems()) {
            if (produto.getNome().equals(nomeProduto)) {
                precoTotal += produto.getPreco();
                tempoTotal += produto.getTempoPreparo();
                break;
            }
        }
    }

    infos.setText(String.format("Preço Total: R$ %.2f\nTempo estimado: %d minutos", precoTotal, tempoTotal));
    
}


    @FXML
private void metodoFinalizar(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Compra Finalizada");
    alert.setHeaderText(null);
    alert.setContentText("Sua compra foi finalizada com sucesso!\n ");
    alert.showAndWait();

    listaCarrinho.getItems().clear();
    atualizarInfos();
}

    @FXML
private void metodoLimpar(ActionEvent event) {
    listaCarrinho.getItems().clear();
    atualizarInfos();
}

}
