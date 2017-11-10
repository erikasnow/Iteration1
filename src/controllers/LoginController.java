package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements ControllableScreen{
    private ScreenController parent;

    public void setParentController(ScreenController parent){
        this.parent = parent;
    }
    @FXML
    private Button btnenter;

    @FXML
    private Button btncancel;

    @FXML
    private TextField txtfldLogin;

    @FXML
    private PasswordField passworkFieldPassword;

}
