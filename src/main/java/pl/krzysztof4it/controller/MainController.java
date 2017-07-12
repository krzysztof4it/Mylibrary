package pl.krzysztof4it.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class MainController {
    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController; /* fxid topMenuButtons from BorderPaneMain name need "fxid + Controller"      */



    @FXML
    private void  initialize(){
        topMenuButtonsController.setMainController(this);

    }



    public void setCenter(String fxmlPath){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath)); // load file FXML
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);

        Parent parent = null; // element in fxml
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }


        borderPane.setCenter(parent);
    }
}
