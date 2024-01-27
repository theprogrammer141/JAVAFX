package org.example.stages;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//       Stage stage=new Stage();
        Group root=new Group();
        Scene scene=new Scene(root, Color.BLACK);


        stage.setWidth(420);
        stage.setHeight(420);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CANNOT ESCAPE UNTIL YOU PRESS q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setTitle("Stages demo program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}