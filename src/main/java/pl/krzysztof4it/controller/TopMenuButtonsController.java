package pl.krzysztof4it.controller;


import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;


public class TopMenuButtonsController {

    public static final String LIBRARY_FXML = "/fxml/Library.fxml";
    public static final String LIST_BOOK_FXML = "/fxml/ListBook.fxml";
    public static final String STATISTIC_FXML = "/fxml/Statistic.fxml";
    public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";


    @FXML
    private MainController mainController; /*Add reference */

    @FXML
    private ToggleGroup toggleButtons;

    public void setMainController(MainController mainController) { /*acces to chanege in main controller*/
        this.mainController = mainController;
    }

    public MainController getMainController() {
        return mainController;
    }

    @FXML
    public void openLibrary() {
        System.out.println("Open Library");

        mainController.setCenter(LIBRARY_FXML);
    }
    @FXML
    public void openListBooks() {
        System.out.println("Open List Books");

        mainController.setCenter(LIST_BOOK_FXML);
    }

    @FXML
    public void openStatistic() {
        System.out.println("Open Statistic");

        mainController.setCenter(STATISTIC_FXML);
    }

    @FXML
    public void addBook() {

        System.out.println("Add book");

        if(toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }

        mainController.setCenter(ADD_BOOK_FXML);
    }

    public void setToggleButtons(ToggleGroup toggleButtons) {
        this.toggleButtons = toggleButtons;
    }
}
