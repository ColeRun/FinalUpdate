package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import pane
import javafx.scene.layout.Pane;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    Deck deck = new Deck();
    
    
    @Override
    public void start(Stage stage) throws IOException {
        //make a pane
        Pane pane = new Pane();

        scene = new Scene(pane , 640, 480);
        stage.setScene(scene);
        stage.show();
        deck.deckgen();
        System.out.println(deck.toString());
    }

   


    public static void main(String[] args) {
        launch();
    }

}