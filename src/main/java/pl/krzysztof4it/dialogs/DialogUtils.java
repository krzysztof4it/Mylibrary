package pl.krzysztof4it.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;


import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Krzysztof on 2017-07-28.
 */
public class DialogUtils {

    /*text from bundles ! required static ! */
    static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

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

}
