package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.util.HashMap;

public class ScreenController extends StackPane {

    public static String AddNodeID = "AddNode";
    public static String AddNodeFile = "AddNode.fmxl";
    public static String AdminMenuID = "AdminMenu";
    public static String AdminMenuFile = "AdminMenu.fxml";
    public static String FilterID = "Filter";
    public static String FilterFile = "Filter.fxml";
    public static String LoginID = "Login";
    public static String LoginFile = "Login.fxml";
    public static String LoginMenuID = "LoginMenu";
    public static String LoginMenuFile = "LoginMenu.fxml";
    public static String LogoutID = "LogoutID";
    public static String LogoutFile = "Logout.fxml";
    public static String MainID = "Main";
    public static String MainFile = "Main.fxml";
    public static String PathID = "Path";
    public static String PathFile = "Path.fxml";
    public static String RequestID = "Request";
    public static String RequestFile = "Request.fxml";
    public static String ServiceChoiceID = "ServiceChoice";
    public static String File = "ServiceChoice.fxml";
    public static String ThankYouID = "ThankYou";
    public static String ThankYouFile = "ThankYou.fxml";

    private HashMap<String, Node> screens = new HashMap<String, Node>();

    public ScreenController(){
        super();
    }

    //add a new screen to the screens HashMap
    public void addScreen(String name, Node screen){
        screens.put(name,screen);
    }



    //return a screen from the screens HashMap
    public Node getScreen(String name){
        return screens.get(name); //stub for function headers
    }

    //load a screen into the overall ui.
    //does not display the screen
    public boolean loadScreen(String name, String file){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(file));
            Parent fxmlToLoad = (Parent) fxmlLoader.load();
            ControllableScreen controllerToLoad = ((ControllableScreen) fxmlLoader.getController());
            controllerToLoad.setParentController(this);
            addScreen(name, fxmlToLoad);
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    //set the screen currently being displayed on the pane
    public boolean setScreen(String name){
        if(screens.containsKey(name)){
            if(!getChildren().isEmpty()){
                getChildren().remove(0);
            }
            getChildren().add(screens.get(name));
            return true;
        }
        return false;
    }

    //unloads a screen from the ui
    public boolean unloadScreen(String name) {
        screens.remove(name);
        return true;
    }
}
