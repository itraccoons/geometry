package org.raccoons.backyards;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class GeometryShapes extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    final ComboBox comboBox = new ComboBox();
    comboBox.getItems().addAll(
            "Point",
            "Circle",
            "Trianle",
            "Rectangle"
    );

    comboBox.setValue("Point");

    Button btn1 = new Button();
    btn1.setText("Add");

    Canvas canvas = new Canvas(300,250);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setFill(Color.GREEN);
    gc.fillOval(1,1,10,10);

    btn1.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        System.out.println(comboBox.getValue().toString());
      }
    });

    HBox hBox = new HBox();
    hBox.getChildren().addAll(comboBox, btn1, canvas);

    primaryStage.setTitle("Geometry Shapes");
    primaryStage.setScene(new Scene(hBox, 300, 250));
    primaryStage.show();
  }
}
