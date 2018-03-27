package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class StartPage{
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    public void load() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/gui/StartPage.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Library");
        stage.show();
    }

    @FXML
    private void signIn(ActionEvent event) {
        //TODO: create a query and send it to server
    }

    @FXML
    private void signUp(ActionEvent event) {
        //TODO: switch to sign up form
    }
}
