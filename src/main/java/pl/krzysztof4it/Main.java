package pl.krzysztof4it;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.krzysztof4it.utils.FxmlUtils;

import java.util.Locale;
import java.util.ResourceBundle;


public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";


    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
        primaryStage.show();

    }
}
