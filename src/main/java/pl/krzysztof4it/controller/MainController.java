package pl.krzysztof4it.controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.krzysztof4it.utils.DialogUtils;
import pl.krzysztof4it.utils.FxmlUtils;

import java.io.IOException;
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



        borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
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
