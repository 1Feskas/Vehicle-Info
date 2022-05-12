package com.example.vehicleinfo_var2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileController {

    @FXML
    private Button addCar;

    @FXML
    private Button deleteCar;

    @FXML
    private Button logOut;

    @FXML
    private Button myCar;

    @FXML
    private Label userIin;

    @FXML
    private Label userName;

    @FXML
    private Label userPhone;

    @FXML
    void initialize() {
        logOut.setOnAction(event -> {
            openNewScene("hello-view.fxml");
        });

        addCar.setOnAction(event ->
                openNewScene("add_car.fxml"));
    }

    public void openNewScene(String window) {
        addCar.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
