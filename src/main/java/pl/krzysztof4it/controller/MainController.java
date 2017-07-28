package pl.krzysztof4it.controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.krzysztof4it.dialogs.DialogUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Optional;
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

    public void closeApplication() {

        Optional<ButtonType> result = DialogUtils.confirmationAlert();

        if (result.get() == ButtonType.OK){
             /*Close Application*/
            Platform.exit();
            System.exit(0);
        }
        /*no need else -> Click Cancel to automatic close window alert*/

    }

    public void setCasspian() {

        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);/*Set style Casspian*/

    }

    public void setModern() {

        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);/*Set style Modena*/

    }

    public void setAllwaysTop(ActionEvent actionEvent) {
        /*Method from class Stage* => ref   */

        /*get value from element Check menu item*/
        boolean value = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get();

        Stage stage= (Stage) borderPane.getScene().getWindow();/*rzutowani i dostęp do metody z Stage*/
        stage.setAlwaysOnTop(value); /*Set allways top*/


    }

    /*menu -> help - > about */
    public void about(ActionEvent actionEvent) {
        DialogUtils.dialogAboutAplication();/*show info window*/
    }
}
