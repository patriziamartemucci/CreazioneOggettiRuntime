/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creazioneoggettiruntime;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author IP5 PRO 16ACH6
 */
public class CreazioneOggettiRuntime extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        primaryStage.setTitle("Creazione a rutime di oggetti");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();//la solita
    }
//commento per provare il commit/push

    public static void main(String[] args) {
        launch(args);
    }
}
