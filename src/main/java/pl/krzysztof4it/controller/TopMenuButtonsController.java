package pl.krzysztof4it.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;


public class TopMenuButtonsController {

    private MainController mainController; /*Add reference */

    @FXML
    private ToggleGroup toggleGroup;

    public void setMainController(MainController mainController) { /*acces to chanege in main controller*/
        this.mainController = mainController;
    }

    @FXML
    public void openLibrary() {
        System.out.println("Open Library");
    }
    @FXML
    public void openListBooks() {
        System.out.println("Open List Books");
    }

    @FXML
    public void openStatistic() {
        System.out.println("Open Statistic");
    }

    @FXML
    public void addBook() {

        System.out.println("Add book");

        if (toggleGroup.getSelectedToggle() != null){
            toggleGroup.getSelectedToggle().setSelected(false); /*ustawia nie zaznaczony przycisk*/
        }
    }
}
