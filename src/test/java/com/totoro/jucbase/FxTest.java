package com.totoro.jucbase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author:totoro
 * @createDate:2023/2/1
 * @description:
 */
public class FxTest extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("按钮");

        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
