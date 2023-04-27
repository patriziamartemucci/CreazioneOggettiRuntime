/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creazioneoggettiruntime;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author IP5 PRO 16ACH6
 */
public class FXMLController implements Initializable {
    
    @FXML
    private Button btnAccendiSpegni;
    
    @FXML
    private Button btnAccendiSpegni2;
    
    @FXML
    private GridPane pannello;
    
    //EventHandler<ActionEvent> eventHandler ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() { 
        @Override 
        public void handle(ActionEvent e) { 
            Object oggetto=e.getSource();
            if(oggetto==btnAccendiSpegni)
                System.out.println("Hai cliccato su btnAccendiSpegni. Evento: "+e.getEventType()); 
            else
                System.out.println("Hai cliccato su btnAccendiSpegni2. Evento: "+e.getEventType());
        } 
     };
        btnAccendiSpegni=new Button();
        btnAccendiSpegni.setLayoutX(100);
        btnAccendiSpegni.setLayoutY(100);
        btnAccendiSpegni.setText("ciao");
        btnAccendiSpegni.addEventFilter(ActionEvent.ACTION, eventHandler);
        pannello.add(btnAccendiSpegni, 0, 0);
        //pannello.
        btnAccendiSpegni.setVisible(true);
        
        btnAccendiSpegni2=new Button();
        btnAccendiSpegni2.setLayoutX(100);
        btnAccendiSpegni2.setLayoutY(100);
        btnAccendiSpegni2.setText("ciao2");
        btnAccendiSpegni2.addEventFilter(ActionEvent.ACTION, eventHandler);
        pannello.add(btnAccendiSpegni2, 0, 1);
        //pannello.
        btnAccendiSpegni2.setVisible(true);
    }    
    
     //public void gestioneClick(ActionEvent event){}
     
    
    
}
