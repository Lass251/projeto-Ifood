/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author joaof_cpnn023
 */
public class utilitarios {
        
    
//        Exemple use:
//        Utility.changeToscene(getClass(), event, "Nome da cena que será tranferida");
    
    public static void changeToscene(Class aClass, Event aEvent, String sceneFileStr) throws Exception{
    
       Parent root = FXMLLoader.load(aClass.getResource(sceneFileStr));
       Scene sceneONE = new Scene(root);
       Stage stage = (Stage) ((Node) aEvent.getSource()).getScene().getWindow(); 
       stage.setScene(sceneONE);
       stage.show();

    }
    
}
