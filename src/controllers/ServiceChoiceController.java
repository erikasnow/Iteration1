package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ServiceController implements ControllableScreen{
    private ScreenController parent;

    public void setParentController(ScreenController parent){
        this.parent = parent;
    }
    @FXML
    private Button btnService;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnCancel;

}
