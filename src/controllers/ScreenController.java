package controllers;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import java.util.HashMap;

public class ScreenController extends StackPane {
    private HashMap<String, Node> screens = new HashMap<String, Node>();

    public ScreenController(){
        super();
    }

    //add a new screen to the screens HashMap
    public void addScreen(String name, Node screen){

    }

    //return a screen from the screens HashMap
    public Node getScreen(String name){
        return new ScreenController(); //stub for function headers
    }

    //load a screen into the overall ui.
    //does not display the screen
    public boolean loadScreen(String name){
        return true; //stub for function headers
    }

    //set the screen currently being displayed on the pane
    public boolean setScreen(String name){
        return true; //stub for function header
    }

    //unloads a screen from the ui
    public boolean unloadScreen(String name){
        return true; //stub for function header
    }

}
