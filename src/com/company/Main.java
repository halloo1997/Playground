package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

@Override
    public void start(Stage primaryStage) {

    Group root = new Group();

    Line seesaw = new Line(60,340,340,140);
    seesaw.setStroke(Color.BLACK);
    seesaw.SetStrokeWidth(15);

    Circle cir = new Circle(70,280,40);
    cir.setStroke(Color.RED);
    cir.setFill(Color.ORANGE);

    Rectangle rec = new Rectangle(240,90,80,70);
    rec.setStroke(Color.GREEN);
    rec.setStrokeWidth(5);
    rec.setFill(Color.YELLOWGREEN);

        StackPane root = new StackPane();
        root.getChildren() .add(btn);

        Scene scene = new Scene(root, 300,250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
}

public static void main (String[] args) {
    launch(args);
}
}
