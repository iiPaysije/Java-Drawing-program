/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs102.dz03;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Dragica
 */
public class Zadatak8 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Canvas platno = new Canvas(800, 500);

        GraphicsContext olovka = platno.getGraphicsContext2D();
        olovka.setLineWidth(1);

        ColorPicker cp = new ColorPicker();
        cp.setValue(Color.BLUE);
        cp.setOnAction(e -> {
            olovka.setStroke(cp.getValue());
        });

        Slider debljina = new Slider();
        debljina.setMin(1);
        debljina.se/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs102.dz03;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Dragica
 */
public class Zadatak8 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Canvas platno = new Canvas(800, 500);

        GraphicsContext olovka = platno.getGraphicsContext2D();
        olovka.setLineWidth(1);

        ColorPicker cp = new ColorPicker();
        cp.setValue(Color.BLUE);
        cp.setOnAction(e -> {
            olovka.setStroke(cp.getValue());
        });

        Slider debljina = new Slider();
        debljina.setMin(1);
        debljina.setMax(6);
        debljina.setShowTickLabels(true);
        debljina.setShowTickMarks(true);
        //funkcionalnost slidera
        debljina.valueProperty().addListener(e -> {
            olovka.setLineWidth(debljina.getValue());
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(platno, cp, debljina);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 600);

        //funkcionalnost crtanja
        platno.setOnMousePressed(e -> {
            olovka.beginPath();
            olovka.lineTo(e.getSceneX(), e.getSceneY());
            olovka.stroke();
        });

        platno.setOnMouseDragged(e -> {
            olovka.lineTo(e.getSceneX(), e.getSceneY());
            olovka.stroke();
        });

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
