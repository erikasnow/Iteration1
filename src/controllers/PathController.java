package controllers;

public class PathController implements ControllableScreen{


    public void setParentController(ScreenController parent){

    }

    @FXML
    private Button btnenter;

    @FXML
    private Button ntncancel;

    @FXML
    private CheckBox chkstairs;

    @FXML
    private Label lblstart;

    @FXML
    private Label lblend;

    @FXML
    private Label lblstairs;

    @FXML
    private Label lbldir;

    @FXML
    private MenuButton mbstart;

    @FXML
    private MenuButton mbend;

}
