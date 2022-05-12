package com.example.vehicleinfo_var2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpIin;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpPhone;

    @FXML
    void initialize() {

         signUpButton.setOnAction(event -> {

             signUpNewUser();

         });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String name = signUpName.getText();
        String iin = signUpIin.getText();
        String phonenumber = signUpPhone.getText();
        String password = password_field.getText();

        User user = new User(name, iin, phonenumber, password);

        dbHandler.signUpUser(user);
    }

}
