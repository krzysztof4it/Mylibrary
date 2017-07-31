package pl.krzysztof4it.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;


import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Krzysztof on 2017-07-28.
 *
 * Tutorial Alert => http://code.makery.ch/blog/javafx-dialogs-official/
 */
public class DialogUtils {

    /*text from bundles ! required static ! */
    static ResourceBundle bundle = FxmlUtils.getResourceBundle();
    /*static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");*/

    /*About application window menu - help*/
    public static void dialogAboutAplication(){
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION); /*information alert*/

        informationAlert.setTitle(bundle.getString("menu.help.about"));/*set title window*/
        informationAlert.setHeaderText(bundle.getString("menu.help.about.header")); /*set header window*/
        informationAlert.setContentText(bundle.getString("menu.help.about.content")); /*set content window*/
        informationAlert.showAndWait();/*show window - OK -> close*/

    }

    public static Optional<ButtonType> confirmationAlert(){
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);

        confirmationAlert.setTitle(bundle.getString("menu.file.close"));
        confirmationAlert.setHeaderText(bundle.getString("menu.file.close.header"));
        confirmationAlert.setContentText(bundle.getString("menu.file.close.content"));
        Optional<ButtonType> result = confirmationAlert.showAndWait(); /*need SDK 1.8*/

        return result; /*return button Click!*/


    }



    public static void errorDialog(String error){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);

        errorAlert.setTitle(bundle.getString("error.title"));
        errorAlert.setHeaderText(bundle.getString("error.header"));
        /*errorAlert.setContentText(bundle.getString());*/ // brak treści

        TextArea textArea = new TextArea(error);
        errorAlert.getDialogPane().setContent(textArea); /*przekazane do alertu -> pola tekstowego */
        /*Effect => pring error in alert - "Location is not set*/
        errorAlert.showAndWait();
    }

}
