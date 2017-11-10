package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;

public class RequestController implements ControllableScreen{
    private ScreenController parent;

    public void setParentController(ScreenController parent){
        this.parent = parent;
    }

    @FXML
    private Button btncreate;

    @FXML
    private Button btncancel;

    @FXML
    private MenuButton serviceDropDown;

    @FXML
    private MenuButton staffDropDown;

    @FXML
    private MenuButton timeDropDown;

    @FXML
    private DatePicker dateMenu;
}