package com.example.vehicleinfo_var2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.vehicleinfo_var2.DatabaseHandler;
import com.example.vehicleinfo_var2.Vehicle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addCarButton;

    @FXML
    private Button logOut;

    @FXML
    private TextField addCarIin;

    @FXML
    private TextField addCarName;

    @FXML
    private TextField addCarNumber;

    @FXML
    void initialize() {
        addCarButton.setOnAction(event -> {
            addNewCar();
        });

        addCarButton.setOnAction(event ->
                openNewScene("profile.fxml"));

        logOut.setOnAction(event ->
                openNewScene("hello-view.fxml"));
    }

    private void addNewCar() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String veh_iin = addCarIin.getText();
        String veh_number = addCarNumber.getText();
        String veh_name = addCarName.getText();

        Vehicle vehicle = new Vehicle(veh_iin, veh_number, veh_name);

        dbHandler.addCar(vehicle);
    }

    public void openNewScene(String window) {
        addCarButton.getScene().getWindow().hide();

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