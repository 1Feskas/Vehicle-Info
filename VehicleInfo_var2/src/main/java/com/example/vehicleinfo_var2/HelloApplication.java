package com.example.vehicleinfo_var2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("VehicleInfo");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}