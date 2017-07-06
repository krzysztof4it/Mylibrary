package pl.krzysztof4it.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;


public class MainController {
    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController; /* fxid topMenuButtons from BorderPaneMain name need "fxid + Controller"      */



    @FXML
    private void  initialize(){
        topMenuButtonsController.setMainController(this);

    }
}
