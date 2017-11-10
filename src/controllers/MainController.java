package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class MainController implements ControllableScreen{
    private ScreenController parent;

    public void setParentController(ScreenController parent){
        this.parent = parent;
    }
    @FXML
    private Button btnlogin;

    @FXML
    private Button btnzout;

    @FXML
    private Slider slideBarZoom;

    @FXML
    private Button btnzin;

    @FXML
    private Button btndirection;

    @FXML
    private Button btnsearch;

    @FXML
    private Button btnfilter;

}
