package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpPage {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField contactInfoField;

    @FXML
    private Button cancelButton;

    @FXML
    private Button signUpButton;

    @FXML
    private void loadStartPage(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/gui/StartPage.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) cancelButton.getScene().getWindow();
        AnchorPane root = (AnchorPane) loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    private void signUp(ActionEvent event) {
        //TODO: create a query and send it to server
    }

}
