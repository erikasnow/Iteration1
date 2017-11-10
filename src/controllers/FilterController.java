package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class FilterController implements ControllableScreen{
    private ScreenController parent;

    public void setParentController(ScreenController parent){
        this.parent = parent;
    }

    @FXML
    private CheckBox checkBoxBathrooms;

    @FXML
    private CheckBox checkBoxExits;

    @FXML
    private Button btncancel;

}
