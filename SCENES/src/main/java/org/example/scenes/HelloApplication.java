package org.example.scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root=new Group();
        Scene scene=new Scene(root,600,600, Color.SKYBLUE);
        Text text=new Text();

        text.setText("WHOOOA!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdena",50));
        text.setFill(Color.LIMEGREEN);

        Line line=new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setRotate(45);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);

        Rectangle rectangle=new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(50);
        rectangle.setHeight(50);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.YELLOW);

        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}