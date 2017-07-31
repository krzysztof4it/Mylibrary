package pl.krzysztof4it.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by Krzysztof on 2017-07-31.
 *
 * klasa do ładowania FXML-i
 */
public class FxmlUtils {

    public static Pane fxmlLoader(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath)); // load file FXML
        loader.setResources(getResourceBundle()); /*przekazanie metody do bundle*/

        try {
            return loader.load(); // element in fxml
        } catch (Exception e) {/*Wyjątek! */
           DialogUtils.errorDialog(e.getMessage()); /*Onsługa błędu*/

        }
        return null;
    }


    /*method to load messages bundles*/
    public static ResourceBundle getResourceBundle(){
        return ResourceBundle.getBundle("bundles.messages");
    }


}
