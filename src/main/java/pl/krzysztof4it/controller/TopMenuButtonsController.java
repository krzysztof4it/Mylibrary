package pl.krzysztof4it.controller;


import javafx.fxml.FXML;


public class TopMenuButtonsController {

    private MainController mainController; /*Add reference */

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
}
